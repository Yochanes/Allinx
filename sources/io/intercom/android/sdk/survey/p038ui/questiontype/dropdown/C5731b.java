package io.intercom.android.sdk.survey.p038ui.questiontype.dropdown;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.questiontype.dropdown.b */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5731b implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f44564a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f44565b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MutableState f44566c;

    public /* synthetic */ C5731b(MutableState mutableState, Function1 function1, String str) {
        this.f44564a = function1;
        this.f44565b = str;
        this.f44566c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return DropDownQuestionKt$DropDownQuestion$1$1$1$4.m16488a(this.f44566c, this.f44564a, this.f44565b);
    }
}
