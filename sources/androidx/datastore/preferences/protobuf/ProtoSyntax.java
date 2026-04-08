package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class ProtoSyntax {

    /* JADX INFO: renamed from: a */
    public static final ProtoSyntax f24075a;

    /* JADX INFO: renamed from: b */
    public static final ProtoSyntax f24076b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ProtoSyntax[] f24077c;

    static {
        ProtoSyntax protoSyntax = new ProtoSyntax("PROTO2", 0);
        f24075a = protoSyntax;
        ProtoSyntax protoSyntax2 = new ProtoSyntax("PROTO3", 1);
        f24076b = protoSyntax2;
        f24077c = new ProtoSyntax[]{protoSyntax, protoSyntax2};
    }

    public static ProtoSyntax valueOf(String str) {
        return (ProtoSyntax) java.lang.Enum.valueOf(ProtoSyntax.class, str);
    }

    public static ProtoSyntax[] values() {
        return (ProtoSyntax[]) f24077c.clone();
    }
}
