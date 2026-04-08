package com.google.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
final class TextFormatEscaper {

    /* JADX INFO: renamed from: com.google.protobuf.TextFormatEscaper$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C49261 implements ByteSequence {
        final /* synthetic */ ByteString val$input;

        public C49261(ByteString byteString) {
            this.val$input = byteString;
        }

        @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
        public byte byteAt(int i) {
            return this.val$input.byteAt(i);
        }

        @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
        public int size() {
            return this.val$input.size();
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.TextFormatEscaper$2 */
    /* JADX INFO: compiled from: Proguard */
    public class C49272 implements ByteSequence {
        final /* synthetic */ byte[] val$input;

        public C49272(byte[] bArr) {
            this.val$input = bArr;
        }

        @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
        public byte byteAt(int i) {
            return this.val$input[i];
        }

        @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
        public int size() {
            return this.val$input.length;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public interface ByteSequence {
        byte byteAt(int i);

        int size();
    }

    private TextFormatEscaper() {
    }

    public static String escapeBytes(ByteSequence byteSequence) {
        StringBuilder sb = new StringBuilder(byteSequence.size());
        for (int i = 0; i < byteSequence.size(); i++) {
            byte bByteAt = byteSequence.byteAt(i);
            if (bByteAt == 34) {
                sb.append("\\\"");
            } else if (bByteAt == 39) {
                sb.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
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
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    public static String escapeBytes(ByteString byteString) {
        return escapeBytes(new C49261(byteString));
    }

    public static String escapeBytes(byte[] bArr) {
        return escapeBytes(new C49272(bArr));
    }
}
