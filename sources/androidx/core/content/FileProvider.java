package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";

    @GuardedBy
    private String mAuthority;

    @Nullable
    @GuardedBy
    private PathStrategy mLocalPathStrategy;

    @NonNull
    private final Object mLock = new Object();
    private final int mResourceId = 0;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File(RemoteSettings.FORWARD_SLASH_STRING);

    @GuardedBy
    private static final HashMap<String, PathStrategy> sCache = new HashMap<>();

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api21Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface PathStrategy {
        /* JADX INFO: renamed from: a */
        File mo7497a(Uri uri);

        /* JADX INFO: renamed from: b */
        Uri mo7498b(File file);
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SimplePathStrategy implements PathStrategy {

        /* JADX INFO: renamed from: a */
        public final String f23119a;

        /* JADX INFO: renamed from: b */
        public final HashMap f23120b = new HashMap();

        public SimplePathStrategy(String str) {
            this.f23119a = str;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m7499c(String str, String str2) {
            String strAccess$000 = FileProvider.access$000(str);
            String strAccess$0002 = FileProvider.access$000(str2);
            if (strAccess$000.equals(strAccess$0002)) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strAccess$0002);
            sb.append('/');
            return strAccess$000.startsWith(sb.toString());
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        /* JADX INFO: renamed from: a */
        public final File mo7497a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = (File) this.f23120b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (m7499c(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // androidx.core.content.FileProvider.PathStrategy
        /* JADX INFO: renamed from: b */
        public final Uri mo7498b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry entry2 : this.f23120b.entrySet()) {
                    String path = ((File) entry2.getValue()).getPath();
                    if (m7499c(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(AbstractC0000a.m13j("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = ((File) entry.getValue()).getPath();
                return new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority(this.f23119a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith(RemoteSettings.FORWARD_SLASH_STRING) ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), RemoteSettings.FORWARD_SLASH_STRING)).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }
    }

    public static String access$000(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    /* JADX INFO: renamed from: b */
    public static PathStrategy m7494b(Context context, int i, String str) {
        PathStrategy pathStrategyM7495c;
        HashMap<String, PathStrategy> map = sCache;
        synchronized (map) {
            try {
                pathStrategyM7495c = map.get(str);
                if (pathStrategyM7495c == null) {
                    try {
                        try {
                            pathStrategyM7495c = m7495c(context, i, str);
                            map.put(str, pathStrategyM7495c);
                        } catch (IOException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pathStrategyM7495c;
    }

    /* JADX INFO: renamed from: c */
    public static SimplePathStrategy m7495c(Context context, int i, String str) throws XmlPullParserException, IOException {
        SimplePathStrategy simplePathStrategy = new SimplePathStrategy(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS), i);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next == 1) {
                return simplePathStrategy;
            }
            if (next == 2) {
                String name = fileProviderPathsMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, ATTR_PATH);
                if (TAG_ROOT_PATH.equals(name)) {
                    externalStorageDirectory = DEVICE_ROOT;
                } else if (TAG_FILES_PATH.equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if (TAG_CACHE_PATH.equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if (TAG_EXTERNAL.equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if (TAG_EXTERNAL_FILES.equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    }
                } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    }
                } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    }
                }
                if (externalStorageDirectory == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        simplePathStrategy.f23120b.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                    } catch (IOException e) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + externalStorageDirectory, e);
                    }
                }
            }
        }
    }

    @VisibleForTesting
    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, @Nullable ProviderInfo providerInfo, int i) {
        if (providerInfo == null) {
            throw new IllegalArgumentException(AbstractC0000a.m13j("Couldn't find meta-data for provider with authority ", str));
        }
        if (providerInfo.metaData == null && i != 0) {
            Bundle bundle = new Bundle(1);
            providerInfo.metaData = bundle;
            bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i);
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    }

    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file) {
        return m7494b(context, 0, str).mo7498b(file);
    }

    /* JADX INFO: renamed from: a */
    public final PathStrategy m7496a() {
        PathStrategy pathStrategy;
        synchronized (this.mLock) {
            try {
                if (this.mAuthority == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = m7494b(getContext(), this.mResourceId, this.mAuthority);
                }
                pathStrategy = this.mLocalPathStrategy;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pathStrategy;
    }

    @Override // android.content.ContentProvider
    @CallSuper
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        synchronized (this.mLock) {
            this.mAuthority = str;
        }
        HashMap<String, PathStrategy> map = sCache;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return m7496a().mo7497a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        File fileMo7497a = m7496a().mo7497a(uri);
        int iLastIndexOf = fileMo7497a.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileMo7497a.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getTypeAnonymous(@NonNull Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) {
        int i;
        File fileMo7497a = m7496a().mo7497a(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(AbstractC0000a.m13j("Invalid mode: ", str));
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileMo7497a, i);
    }

    @Override // android.content.ContentProvider
    @NonNull
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        int i;
        File fileMo7497a = m7496a().mo7497a(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileMo7497a.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(fileMo7497a.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @NonNull ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @NonNull
    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file, @NonNull String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }
}
