package com.exchange.allin.p024ui.widgets;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.king.ultraswiperefresh.UltraSwipeRefreshState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.exchange.allin.ui.widgets.t */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3550t implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UltraSwipeRefreshState f41566b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Function0 f41567c;

    public /* synthetic */ C3550t(UltraSwipeRefreshState ultraSwipeRefreshState, Function0 function0, int i) {
        this.f41565a = i;
        this.f41566b = ultraSwipeRefreshState;
        this.f41567c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41565a) {
            case 0:
                ((SnapshotMutableStateImpl) this.f41566b.f43131b).setValue(Boolean.TRUE);
                this.f41567c.invoke();
                break;
            default:
                ((SnapshotMutableStateImpl) this.f41566b.f43132c).setValue(Boolean.TRUE);
                this.f41567c.invoke();
                break;
        }
        return Unit.f51459a;
    }
}
