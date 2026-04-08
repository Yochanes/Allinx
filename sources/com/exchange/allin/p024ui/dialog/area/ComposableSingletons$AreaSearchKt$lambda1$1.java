package com.exchange.allin.p024ui.dialog.area;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import com.exchange.allin.R;
import com.exchange.allin.p024ui.theme.AppTheme;
import com.exchange.allin.p024ui.widgets.SpacerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.exchange.allin.ui.dialog.area.ComposableSingletons$AreaSearchKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18303k = 3, m18304mv = {2, 1, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ComposableSingletons$AreaSearchKt$lambda1$1 implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: a */
    public static final ComposableSingletons$AreaSearchKt$lambda1$1 f36142a = new ComposableSingletons$AreaSearchKt$lambda1$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.mo4242t()) {
            composer.mo4246x();
        } else {
            IconKt.m3753a(PainterResources_androidKt.m6256a(R.drawable.ic_search, composer, 0), null, SizeKt.m2826n(Modifier.Companion.f17180a, 20), AppTheme.m14099a(composer).m14085k(), composer, 432, 0);
            SpacerKt.m14148c(8, composer, 6);
        }
        return Unit.f51459a;
    }
}
