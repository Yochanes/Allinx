package autodispose2;

import org.reactivestreams.Subscription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
final class AutoSubscriptionHelper implements Subscription {

    /* JADX INFO: renamed from: a */
    public static final AutoSubscriptionHelper f33227a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AutoSubscriptionHelper[] f33228b;

    static {
        AutoSubscriptionHelper autoSubscriptionHelper = new AutoSubscriptionHelper("CANCELLED", 0);
        f33227a = autoSubscriptionHelper;
        f33228b = new AutoSubscriptionHelper[]{autoSubscriptionHelper};
    }

    public static AutoSubscriptionHelper valueOf(String str) {
        return (AutoSubscriptionHelper) Enum.valueOf(AutoSubscriptionHelper.class, str);
    }

    public static AutoSubscriptionHelper[] values() {
        return (AutoSubscriptionHelper[]) f33228b.clone();
    }

    @Override // org.reactivestreams.Subscription
    public final void cancel() {
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j) {
    }
}
