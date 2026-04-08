package com.exchange.allin.utils.ext;

import android.graphics.DashPathEffect;
import androidx.compose.p013ui.graphics.AndroidPathEffect;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.exchange.allin.utils.ext.a */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3568a implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f41678a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f41679b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f41680c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f41681d;

    public /* synthetic */ C3568a(float f, float f2, float f3, long j) {
        this.f41678a = f;
        this.f41679b = f2;
        this.f41680c = f3;
        this.f41681d = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DrawScope drawBehind = (DrawScope) obj;
        Intrinsics.m18599g(drawBehind, "$this$drawBehind");
        float fMo2551X0 = drawBehind.mo2551X0(this.f41678a);
        AndroidPathEffect androidPathEffect = new AndroidPathEffect(new DashPathEffect(new float[]{drawBehind.mo2551X0(this.f41679b), drawBehind.mo2551X0(this.f41680c)}, 0.0f));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo5383h() & 4294967295L)) - (fMo2551X0 / 2);
        DrawScope.m5377f1(drawBehind, this.f41681d, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo5383h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), fMo2551X0, 0, androidPathEffect, 464);
        return Unit.f51459a;
    }
}
