package androidx.emoji2.text.flatbuffer;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public abstract class Utf8 {

    /* JADX INFO: renamed from: a */
    public static Utf8Safe f24376a;

    /* JADX INFO: compiled from: Proguard */
    public static class DecodeUtil {
        /* JADX INFO: renamed from: a */
        public static boolean m8831a(byte b2) {
            return b2 > -65;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class UnpairedSurrogateException extends IllegalArgumentException {
    }
}
