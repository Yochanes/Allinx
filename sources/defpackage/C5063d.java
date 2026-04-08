package defpackage;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: d */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5063d implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43498a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BottomSheetDialog f43499b;

    public /* synthetic */ C5063d(BottomSheetDialog bottomSheetDialog, int i) {
        this.f43498a = i;
        this.f43499b = bottomSheetDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f43498a) {
            case 0:
                this.f43499b.dismiss();
                break;
            case 1:
                this.f43499b.dismiss();
                break;
            default:
                this.f43499b.dismiss();
                break;
        }
        return Unit.f51459a;
    }
}
