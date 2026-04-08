package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class TextFormatEscaper {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.TextFormatEscaper$1 */
    /* JADX INFO: compiled from: Proguard */
    final class C15921 implements ByteSequence {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ByteString f24138a;

        public C15921(ByteString byteString) {
            this.f24138a = byteString;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.TextFormatEscaper$2 */
    /* JADX INFO: compiled from: Proguard */
    final class C15932 implements ByteSequence {
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ByteSequence {
    }

    /* JADX INFO: renamed from: a */
    public static String m8639a(ByteString byteString) {
        C15921 c15921 = new C15921(byteString);
        StringBuilder sb = new StringBuilder(byteString.size());
        int i = 0;
        while (true) {
            ByteString byteString2 = c15921.f24138a;
            if (i >= byteString2.size()) {
                return sb.toString();
            }
            byte bMo8349c = byteString2.mo8349c(i);
            if (bMo8349c == 34) {
                sb.append("\\\"");
            } else if (bMo8349c == 39) {
                sb.append("\\'");
            } else if (bMo8349c != 92) {
                switch (bMo8349c) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case TYPE_BYTES_VALUE:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo8349c >= 32 && bMo8349c <= 126) {
                            sb.append((char) bMo8349c);
                        } else {
                            sb.append('\\');
                            sb.append((char) (((bMo8349c >>> 6) & 3) + 48));
                            sb.append((char) (((bMo8349c >>> 3) & 7) + 48));
                            sb.append((char) ((bMo8349c & 7) + 48));
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
            i++;
        }
    }
}
