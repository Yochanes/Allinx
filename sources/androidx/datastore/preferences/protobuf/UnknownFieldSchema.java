package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
abstract class UnknownFieldSchema<T, B> {
    /* JADX INFO: renamed from: a */
    public abstract void mo8640a(Object obj, int i, int i2);

    /* JADX INFO: renamed from: b */
    public abstract void mo8641b(Object obj, int i, long j);

    /* JADX INFO: renamed from: c */
    public abstract void mo8642c(Object obj, int i, Object obj2);

    /* JADX INFO: renamed from: d */
    public abstract void mo8643d(Object obj, int i, ByteString byteString);

    /* JADX INFO: renamed from: e */
    public abstract void mo8644e(Object obj, int i, long j);

    /* JADX INFO: renamed from: f */
    public abstract UnknownFieldSetLite mo8645f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract UnknownFieldSetLite mo8646g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract int mo8647h(Object obj);

    /* JADX INFO: renamed from: i */
    public abstract int mo8648i(Object obj);

    /* JADX INFO: renamed from: j */
    public abstract void mo8649j(Object obj);

    /* JADX INFO: renamed from: k */
    public abstract UnknownFieldSetLite mo8650k(Object obj, Object obj2);

    /* JADX INFO: renamed from: l */
    public final boolean m8651l(Object obj, Reader reader) throws InvalidProtocolBufferException {
        int tag = reader.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            mo8644e(obj, i, reader.readInt64());
            return true;
        }
        if (i2 == 1) {
            mo8641b(obj, i, reader.readFixed64());
            return true;
        }
        if (i2 == 2) {
            mo8643d(obj, i, reader.readBytes());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.m8520c();
            }
            mo8640a(obj, i, reader.readFixed32());
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLiteMo8652m = mo8652m();
        int i3 = (i << 3) | 4;
        while (reader.getFieldNumber() != Integer.MAX_VALUE && m8651l(unknownFieldSetLiteMo8652m, reader)) {
        }
        if (i3 != reader.getTag()) {
            throw InvalidProtocolBufferException.m8518a();
        }
        mo8642c(obj, i, mo8655p(unknownFieldSetLiteMo8652m));
        return true;
    }

    /* JADX INFO: renamed from: m */
    public abstract UnknownFieldSetLite mo8652m();

    /* JADX INFO: renamed from: n */
    public abstract void mo8653n(Object obj, Object obj2);

    /* JADX INFO: renamed from: o */
    public abstract void mo8654o(GeneratedMessageLite generatedMessageLite, Object obj);

    /* JADX INFO: renamed from: p */
    public abstract UnknownFieldSetLite mo8655p(Object obj);

    /* JADX INFO: renamed from: q */
    public abstract void mo8656q(Object obj, Writer writer);

    /* JADX INFO: renamed from: r */
    public abstract void mo8657r(Object obj, Writer writer);
}
