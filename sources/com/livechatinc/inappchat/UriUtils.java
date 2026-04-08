package com.livechatinc.inappchat;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.settings.RemoteSettings;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class UriUtils {
    /* JADX INFO: renamed from: a */
    public static String m15410a(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Throwable th;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m15411b(Context context, Uri uri) {
        Uri uri2 = null;
        if (!DocumentsContract.isDocumentUri(context, uri)) {
            return FirebaseAnalytics.Param.CONTENT.equalsIgnoreCase(uri.getScheme()) ? m15410a(context, uri, null, null) : uri.getPath();
        }
        if ("com.android.externalstorage.documents".equals(uri.getAuthority())) {
            String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            if (!"primary".equalsIgnoreCase(str)) {
                return uri.getPath();
            }
            return Environment.getExternalStorageDirectory() + RemoteSettings.FORWARD_SLASH_STRING + str2;
        }
        if ("com.android.providers.downloads.documents".equals(uri.getAuthority())) {
            return m15410a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), null, null);
        }
        if (!"com.android.providers.media.documents".equals(uri.getAuthority())) {
            return uri.getPath();
        }
        String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
        String str3 = strArrSplit2[0];
        String str4 = strArrSplit2[1];
        str3.getClass();
        switch (str3) {
            case "audio":
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                break;
            case "image":
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                break;
            case "video":
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                break;
        }
        return m15410a(context, uri2, "_id=?", new String[]{str4});
    }
}
