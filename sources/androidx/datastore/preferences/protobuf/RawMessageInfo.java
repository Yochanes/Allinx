package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class RawMessageInfo implements MessageInfo {

    /* JADX INFO: renamed from: a */
    public final MessageLite f24084a;

    /* JADX INFO: renamed from: b */
    public final String f24085b;

    /* JADX INFO: renamed from: c */
    public final Object[] f24086c;

    /* JADX INFO: renamed from: d */
    public final int f24087d;

    public RawMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        this.f24084a = messageLite;
        this.f24085b = str;
        this.f24086c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f24087d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 55296) {
                this.f24087d = i | (cCharAt2 << i3);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final MessageLite getDefaultInstance() {
        return this.f24084a;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final ProtoSyntax getSyntax() {
        return (this.f24087d & 1) == 1 ? ProtoSyntax.f24075a : ProtoSyntax.f24076b;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final boolean isMessageSetWireFormat() {
        return (this.f24087d & 2) == 2;
    }
}
