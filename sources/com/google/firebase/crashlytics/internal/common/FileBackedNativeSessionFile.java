package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class FileBackedNativeSessionFile implements NativeSessionFile {

    @NonNull
    private final String dataTransportFilename;

    @NonNull
    private final File file;

    @NonNull
    private final String reportsEndpointFilename;

    public FileBackedNativeSessionFile(@NonNull String str, @NonNull String str2, @NonNull File file) {
        this.dataTransportFilename = str;
        this.reportsEndpointFilename = str2;
        this.file = file;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] asGzippedBytes() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        try {
            InputStream stream = getStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } finally {
                }
                if (stream == null) {
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    if (stream != null) {
                        stream.close();
                    }
                    return null;
                }
                while (true) {
                    try {
                        int i = stream.read(bArr);
                        if (i <= 0) {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            stream.close();
                            return byteArray;
                        }
                        gZIPOutputStream.write(bArr, 0, i);
                    } finally {
                    }
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @Nullable
    public CrashlyticsReport.FilesPayload.File asFilePayload() {
        byte[] bArrAsGzippedBytes = asGzippedBytes();
        if (bArrAsGzippedBytes != null) {
            return CrashlyticsReport.FilesPayload.File.builder().setContents(bArrAsGzippedBytes).setFilename(this.dataTransportFilename).build();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @NonNull
    public String getReportsEndpointFilename() {
        return this.reportsEndpointFilename;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    @Nullable
    public InputStream getStream() {
        if (this.file.exists() && this.file.isFile()) {
            try {
                return new FileInputStream(this.file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
