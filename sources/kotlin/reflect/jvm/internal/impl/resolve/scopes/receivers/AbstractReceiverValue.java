package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractReceiverValue implements ReceiverValue {

    /* JADX INFO: renamed from: a */
    public final KotlinType f54475a;

    /* JADX INFO: renamed from: b */
    public final ReceiverValue f54476b;

    public AbstractReceiverValue(KotlinType kotlinType, ReceiverValue receiverValue) {
        if (kotlinType == null) {
            m20006c(0);
            throw null;
        }
        this.f54475a = kotlinType;
        this.f54476b = receiverValue == null ? this : receiverValue;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20006c(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 1 && i != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
    public final KotlinType getType() {
        KotlinType kotlinType = this.f54475a;
        if (kotlinType != null) {
            return kotlinType;
        }
        m20006c(1);
        throw null;
    }
}
