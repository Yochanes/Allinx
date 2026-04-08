package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.QueueFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
class QueueFileLogStore implements FileLogStore {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private QueueFile logFile;
    private final int maxLogSize;
    private final File workingFile;

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.metadata.QueueFileLogStore$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C46661 implements QueueFile.ElementReader {
        final /* synthetic */ byte[] val$logBytes;
        final /* synthetic */ int[] val$offsetHolder;

        public C46661(byte[] bArr, int[] iArr) {
            this.val$logBytes = bArr;
            this.val$offsetHolder = iArr;
        }

        @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
        public void read(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.val$logBytes, this.val$offsetHolder[0], i);
                int[] iArr = this.val$offsetHolder;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class LogBytes {
        public final byte[] bytes;
        public final int offset;

        public LogBytes(byte[] bArr, int i) {
            this.bytes = bArr;
            this.offset = i;
        }
    }

    public QueueFileLogStore(File file, int i) {
        this.workingFile = file;
        this.maxLogSize = i;
    }

    private void doWriteToLog(long j, String str) {
        if (this.logFile == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i = this.maxLogSize / 4;
            if (str.length() > i) {
                str = "..." + str.substring(str.length() - i);
            }
            this.logFile.add(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(UTF_8));
            while (!this.logFile.isEmpty() && this.logFile.usedBytes() > this.maxLogSize) {
                this.logFile.remove();
            }
        } catch (IOException e) {
            Logger.getLogger().m15164e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    private LogBytes getLogBytes() {
        if (!this.workingFile.exists()) {
            return null;
        }
        openLogFile();
        QueueFile queueFile = this.logFile;
        if (queueFile == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[queueFile.usedBytes()];
        try {
            this.logFile.forEach(new C46661(bArr, iArr));
        } catch (IOException e) {
            Logger.getLogger().m15164e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new LogBytes(bArr, iArr[0]);
    }

    private void openLogFile() {
        if (this.logFile == null) {
            try {
                this.logFile = new QueueFile(this.workingFile);
            } catch (IOException e) {
                Logger.getLogger().m15164e("Could not open log file: " + this.workingFile, e);
            }
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void closeLogFile() {
        CommonUtils.closeOrLog(this.logFile, "There was a problem closing the Crashlytics log file.");
        this.logFile = null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void deleteLogFile() {
        closeLogFile();
        this.workingFile.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public byte[] getLogAsBytes() {
        LogBytes logBytes = getLogBytes();
        if (logBytes == null) {
            return null;
        }
        int i = logBytes.offset;
        byte[] bArr = new byte[i];
        System.arraycopy(logBytes.bytes, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public String getLogAsString() {
        byte[] logAsBytes = getLogAsBytes();
        if (logAsBytes != null) {
            return new String(logAsBytes, UTF_8);
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.FileLogStore
    public void writeToLog(long j, String str) {
        openLogFile();
        doWriteToLog(j, str);
    }
}
