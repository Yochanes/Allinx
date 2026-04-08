package com.exchange.allin.p024ui.dialog.verify;

import android.content.Context;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.exchange.allin.p024ui.dialog.IBottomSheetDialog;
import com.exchange.allin.repository.UserRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005¨\u0006\u0007²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m18302d2 = {"Lcom/exchange/allin/ui/helper/UserHelper$ViewState;", "userState", "", "code", "googleCode", "codeTime", "googleTime", "app_localRelease"}, m18303k = 2, m18304mv = {2, 1, 0}, m18306xi = 48)
public final class SecurityVerifyKt {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        if (r2.collect(r14, r9) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m13606a(boolean z2, int i, String str, String str2, String str3, Function1 function1, ContinuationImpl continuationImpl) {
        SecurityVerifyKt$sendCode$1 securityVerifyKt$sendCode$1;
        Function1 function12;
        if (continuationImpl instanceof SecurityVerifyKt$sendCode$1) {
            securityVerifyKt$sendCode$1 = (SecurityVerifyKt$sendCode$1) continuationImpl;
            int i2 = securityVerifyKt$sendCode$1.f36805c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                securityVerifyKt$sendCode$1.f36805c = i2 - Integer.MIN_VALUE;
            } else {
                securityVerifyKt$sendCode$1 = new SecurityVerifyKt$sendCode$1(continuationImpl);
            }
        }
        SecurityVerifyKt$sendCode$1 securityVerifyKt$sendCode$12 = securityVerifyKt$sendCode$1;
        Object obj = securityVerifyKt$sendCode$12.f36804b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
        int i3 = securityVerifyKt$sendCode$12.f36805c;
        if (i3 == 0) {
            ResultKt.m18313b(obj);
            UserRepository userRepository = new UserRepository();
            securityVerifyKt$sendCode$12.f36803a = function1;
            securityVerifyKt$sendCode$12.f36805c = 1;
            Object objM13508A = UserRepository.m13508A(userRepository, z2, i, str, str2, str3, null, securityVerifyKt$sendCode$12, 32);
            if (objM13508A != coroutineSingletons) {
                obj = objM13508A;
                function12 = function1;
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m18313b(obj);
            return Unit.f51459a;
        }
        function12 = securityVerifyKt$sendCode$12.f36803a;
        ResultKt.m18313b(obj);
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1((Flow) obj, new SecurityVerifyKt$sendCode$2(function12, null));
        SecurityVerifyKt$sendCode$3 securityVerifyKt$sendCode$3 = new SecurityVerifyKt$sendCode$3(function12);
        securityVerifyKt$sendCode$12.f36803a = null;
        securityVerifyKt$sendCode$12.f36805c = 2;
    }

    /* JADX INFO: renamed from: b */
    public static final void m13607b(Context context, int i, Function1 function1) {
        Intrinsics.m18599g(context, "context");
        new IBottomSheetDialog(context, null, new ComposableLambdaImpl(-1625984914, new SecurityVerifyKt$showSecurityVerifyBottomSheetDialog$1(function1, i), true), 14).show();
    }
}
