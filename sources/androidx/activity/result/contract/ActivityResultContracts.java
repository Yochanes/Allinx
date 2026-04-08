package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p011a.AbstractC0024a;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts;", "", "CaptureVideo", "CreateDocument", "GetContent", "GetMultipleContents", "OpenDocument", "OpenDocumentTree", "OpenMultipleDocuments", "PickContact", "PickMultipleVisualMedia", "PickVisualMedia", "RequestMultiplePermissions", "RequestPermission", "StartActivityForResult", "StartIntentSenderForResult", "TakePicture", "TakePicturePreview", "TakeVideo", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class ActivityResultContracts {

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CaptureVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Uri input = (Uri) obj;
            Intrinsics.m18599g(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.m18598f(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri uri) {
            Uri input = uri;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$CreateDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class CreateDocument extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String input = (String) obj;
            Intrinsics.m18599g(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(null).putExtra("android.intent.extra.TITLE", input);
            Intrinsics.m18598f(intentPutExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return intentPutExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String str) {
            String input = str;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetContent;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class GetContent extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String input = (String) obj;
            Intrinsics.m18599g(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            Intrinsics.m18598f(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String str) {
            String input = str;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "Companion", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            /* JADX INFO: renamed from: a */
            public static List m230a(Intent intent) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return EmptyList.f51496a;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String input = (String) obj;
            Intrinsics.m18599g(input, "input");
            Intent intentPutExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            Intrinsics.m18598f(intentPutExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return intentPutExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String str) {
            String input = str;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            return intent != null ? Companion.m230a(intent) : EmptyList.f51496a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¨\u0006\u0005"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class OpenDocument extends ActivityResultContract<String[], Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String[] input = (String[]) obj;
            Intrinsics.m18599g(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            Intrinsics.m18598f(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String[] strArr) {
            String[] input = strArr;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @RequiresApi
    @SourceDebugExtension
    public static class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Uri uri = (Uri) obj;
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, Uri uri) {
            Intrinsics.m18599g(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001¨\u0006\u0007"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String[] input = (String[]) obj;
            Intrinsics.m18599g(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            Intrinsics.m18598f(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String[] strArr) {
            String[] input = strArr;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            return intent != null ? GetMultipleContents.Companion.m230a(intent) : EmptyList.f51496a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickContact;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/net/Uri;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class PickContact extends ActivityResultContract<Void, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            Intrinsics.m18598f(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0006¨\u0006\u0007"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "Companion", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickMultipleVisualMedia$Companion;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            PickVisualMediaRequest input = (PickVisualMediaRequest) obj;
            Intrinsics.m18599g(input, "input");
            if (PickVisualMedia.Companion.m233c()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(PickVisualMedia.Companion.m232b(input.f237a));
                int iMin = Math.min(0, input.f238b);
                if (iMin <= 1 || iMin > AbstractC0024a.m79a()) {
                    throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.f239c.mo234a());
                intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
                return intent;
            }
            if (PickVisualMedia.Companion.m231a(context) == null) {
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.setType(PickVisualMedia.Companion.m232b(input.f237a));
                intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent2.getType() == null) {
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent2;
            }
            ResolveInfo resolveInfoM231a = PickVisualMedia.Companion.m231a(context);
            if (resolveInfoM231a == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoM231a.activityInfo;
            Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent3.setType(PickVisualMedia.Companion.m232b(input.f237a));
            int iMin2 = Math.min(0, input.f238b);
            if (iMin2 <= 1) {
                throw new IllegalArgumentException("Max items must be greater than 1");
            }
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.f239c.mo234a());
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
            return intent3;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            PickVisualMediaRequest input = pickVisualMediaRequest;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            return intent != null ? GetMultipleContents.Companion.m230a(intent) : EmptyList.f51496a;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/PickVisualMediaRequest;", "Landroid/net/Uri;", "Companion", "DefaultTab", "ImageAndVideo", "ImageOnly", "SingleMimeType", "VideoOnly", "VisualMediaType", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$Companion;", "", "", "GMS_ACTION_PICK_IMAGES", "Ljava/lang/String;", "GMS_EXTRA_PICK_IMAGES_MAX", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
            /* JADX INFO: renamed from: a */
            public static ResolveInfo m231a(Context context) {
                return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
            }

            /* JADX INFO: renamed from: b */
            public static String m232b(VisualMediaType input) {
                Intrinsics.m18599g(input, "input");
                if (input instanceof ImageOnly) {
                    return "image/*";
                }
                if (input instanceof VideoOnly) {
                    return "video/*";
                }
                if (input instanceof SingleMimeType) {
                    return null;
                }
                if (input instanceof ImageAndVideo) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }

            /* JADX INFO: renamed from: c */
            public static boolean m233c() {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    return true;
                }
                return i >= 30 && AbstractC0025b.m110b() >= 2;
            }
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "", "AlbumsTab", "PhotosTab", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static abstract class DefaultTab {

            /* JADX INFO: compiled from: Proguard */
            @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab$AlbumsTab;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
            public static final class AlbumsTab extends DefaultTab {
                @Override // androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab
                /* JADX INFO: renamed from: a */
                public final int mo234a() {
                    return 0;
                }
            }

            /* JADX INFO: compiled from: Proguard */
            @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab$PhotosTab;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
            public static final class PhotosTab extends DefaultTab {

                /* JADX INFO: renamed from: a */
                public static final PhotosTab f248a = new PhotosTab();

                @Override // androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.DefaultTab
                /* JADX INFO: renamed from: a */
                public final int mo234a() {
                    return 1;
                }
            }

            /* JADX INFO: renamed from: a */
            public abstract int mo234a();
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class ImageAndVideo implements VisualMediaType {

            /* JADX INFO: renamed from: a */
            public static final ImageAndVideo f249a = new ImageAndVideo();
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class ImageOnly implements VisualMediaType {

            /* JADX INFO: renamed from: a */
            public static final ImageOnly f250a = new ImageOnly();
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$SingleMimeType;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class SingleMimeType implements VisualMediaType {
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class VideoOnly implements VisualMediaType {
        }

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageAndVideo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$ImageOnly;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$SingleMimeType;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VideoOnly;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public interface VisualMediaType {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            PickVisualMediaRequest input = (PickVisualMediaRequest) obj;
            Intrinsics.m18599g(input, "input");
            if (Companion.m233c()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(Companion.m232b(input.f237a));
                intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.f239c.mo234a());
                return intent;
            }
            if (Companion.m231a(context) == null) {
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.setType(Companion.m232b(input.f237a));
                if (intent2.getType() == null) {
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                }
                return intent2;
            }
            ResolveInfo resolveInfoM231a = Companion.m231a(context);
            if (resolveInfoM231a == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoM231a.activityInfo;
            Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent3.setType(Companion.m232b(input.f237a));
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.f239c.mo234a());
            return intent3;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            PickVisualMediaRequest input = pickVisualMediaRequest;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            return data == null ? (Uri) CollectionsKt.m18402D(GetMultipleContents.Companion.m230a(intent)) : data;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\u0007¨\u0006\b"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Companion", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions$Companion;", "", "", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String[] input = (String[]) obj;
            Intrinsics.m18599g(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            Intrinsics.m18598f(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
            String[] input = strArr;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            if (input.length == 0) {
                return new ActivityResultContract.SynchronousResult<>((Serializable) MapsKt.m18481d());
            }
            for (String str : input) {
                if (ContextCompat.m7484a(context, str) != 0) {
                    return null;
                }
            }
            int iM18484g = MapsKt.m18484g(input.length);
            if (iM18484g < 16) {
                iM18484g = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM18484g);
            for (String str2 : input) {
                linkedHashMap.put(str2, Boolean.TRUE);
            }
            return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                return MapsKt.m18481d();
            }
            if (intent == null) {
                return MapsKt.m18481d();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return MapsKt.m18481d();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i2 == 0));
            }
            return MapsKt.m18489l(CollectionsKt.m18403D0(ArraysKt.m18334A(stringArrayExtra), arrayList));
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String input = (String) obj;
            Intrinsics.m18599g(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input});
            Intrinsics.m18598f(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, String str) {
            String input = str;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            if (ContextCompat.m7484a(context, input) == 0) {
                return new ActivityResultContract.SynchronousResult<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (intent == null || i != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z2 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (intArrayExtra[i2] == 0) {
                        z2 = true;
                        break;
                    }
                    i2++;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "Companion", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult$Companion;", "", "", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "Ljava/lang/String;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Intent input = (Intent) obj;
            Intrinsics.m18599g(input, "input");
            return input;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "Companion", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {

        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult$Companion;", "", "", "ACTION_INTENT_SENDER_REQUEST", "Ljava/lang/String;", "EXTRA_INTENT_SENDER_REQUEST", "EXTRA_SEND_INTENT_EXCEPTION", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
        public static final class Companion {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            IntentSenderRequest input = (IntentSenderRequest) obj;
            Intrinsics.m18599g(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
            Intrinsics.m18598f(intentPutExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return intentPutExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static class TakePicture extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Uri input = (Uri) obj;
            Intrinsics.m18599g(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            Intrinsics.m18598f(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri uri) {
            Uri input = uri;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @SourceDebugExtension
    public static class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Void r2) {
            Intrinsics.m18599g(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, m18302d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$TakeVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "activity_release"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    @Deprecated
    @SourceDebugExtension
    public static class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Uri input = (Uri) obj;
            Intrinsics.m18599g(input, "input");
            Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.m18598f(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return intentPutExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Uri uri) {
            Uri input = uri;
            Intrinsics.m18599g(context, "context");
            Intrinsics.m18599g(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i, Intent intent) {
            if (i != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }
}
