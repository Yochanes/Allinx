package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*¦\u0001\b\u0007\u0010\n\"M\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00002M\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0000B\u0002\b\t*¦\u0001\b\u0007\u0010\f\"M\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002M\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000B\u0002\b\t*Þ\u0001\b\u0007\u0010\u0010\"i\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\r\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u00000\u00002i\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\r\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u00000\u0000B\u0002\b\t¨\u0006\u0011"}, m18302d2 = {"Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "clauseObject", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "param", "", "Lkotlinx/coroutines/InternalCoroutinesApi;", "RegistrationFunction", "clauseResult", "ProcessResultFunction", "internalResult", "", "Lkotlin/coroutines/CoroutineContext;", "OnCancellationConstructor", "kotlinx-coroutines-core"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class SelectKt {

    /* JADX INFO: renamed from: a */
    public static final Function3 f56527a = null;

    /* JADX INFO: renamed from: b */
    public static final Symbol f56528b = new Symbol("STATE_REG");

    /* JADX INFO: renamed from: c */
    public static final Symbol f56529c = new Symbol("STATE_COMPLETED");

    /* JADX INFO: renamed from: d */
    public static final Symbol f56530d = new Symbol("STATE_CANCELLED");

    /* JADX INFO: renamed from: e */
    public static final Symbol f56531e = new Symbol("NO_RESULT");

    /* JADX INFO: renamed from: f */
    public static final Symbol f56532f = new Symbol("PARAM_CLAUSE_0");
}
