package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractMessageLite implements MessageLite {

    /* JADX INFO: compiled from: Proguard */
    public static abstract class Builder<BuilderType extends Builder> implements MessageLite.Builder {
        /* JADX INFO: renamed from: b */
        public abstract Builder mo19418b();

        /* JADX INFO: renamed from: c */
        public abstract Builder mo19419c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite);

        public /* bridge */ /* synthetic */ Object clone() {
            return mo19418b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
        /* JADX INFO: renamed from: n */
        public /* bridge */ /* synthetic */ MessageLite.Builder mo19425n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return mo19419c(codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: compiled from: Proguard */
        public static final class LimitedInputStream extends FilterInputStream {

            /* JADX INFO: renamed from: a */
            public int f54072a;

            public LimitedInputStream(ByteArrayInputStream byteArrayInputStream, int i) {
                super(byteArrayInputStream);
                this.f54072a = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.f54072a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f54072a <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.f54072a--;
                }
                return i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.f54072a));
                if (jSkip >= 0) {
                    this.f54072a = (int) (((long) this.f54072a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f54072a;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.f54072a -= i4;
                }
                return i4;
            }
        }
    }
}
