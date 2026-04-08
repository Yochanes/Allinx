package io.intercom.android.sdk.p032m5.conversation.p033ui.components;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import io.intercom.android.sdk.p032m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.p032m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.p041ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class ConversationKebabKt$ConversationKebab$3$3$3 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ List<HeaderMenuItem> $headerMenuItems;
    final /* synthetic */ MutableState<Boolean> $isExpanded;
    final /* synthetic */ Function1<HeaderMenuItem, Unit> $onMenuClicked;
    final /* synthetic */ Function1<MetricData, Unit> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    public ConversationKebabKt$ConversationKebab$3$3$3(List<? extends HeaderMenuItem> list, Function1<? super HeaderMenuItem, Unit> function1, Function1<? super MetricData, Unit> function12, long j, MutableState<Boolean> mutableState) {
        this.$headerMenuItems = list;
        this.$onMenuClicked = function1;
        this.$trackMetric = function12;
        this.$contentColor = j;
        this.$isExpanded = mutableState;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m15783a(MutableState mutableState, Function1 function1, HeaderMenuItem headerMenuItem, Function1 function12) {
        return invoke$lambda$2$lambda$1$lambda$0(mutableState, function1, headerMenuItem, function12);
    }

    private static final Unit invoke$lambda$2$lambda$1$lambda$0(MutableState isExpanded, Function1 function1, HeaderMenuItem it, Function1 function12) {
        Intrinsics.m18599g(isExpanded, "$isExpanded");
        Intrinsics.m18599g(it, "$it");
        isExpanded.setValue(Boolean.FALSE);
        function1.invoke(it);
        function12.invoke(ConversationKebabKt.access$metricData(it, true));
        return Unit.f51459a;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f51459a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(ColumnScope DropdownMenu, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.m18599g(DropdownMenu, "$this$DropdownMenu");
        if ((i & 81) == 16 && composer2.mo4242t()) {
            composer2.mo4246x();
            return;
        }
        List<HeaderMenuItem> list = this.$headerMenuItems;
        Function1<HeaderMenuItem, Unit> function1 = this.$onMenuClicked;
        Function1<MetricData, Unit> function12 = this.$trackMetric;
        long j = this.$contentColor;
        MutableState<Boolean> mutableState = this.$isExpanded;
        for (HeaderMenuItem headerMenuItem : list) {
            String text = headerMenuItem.getLabel().getText(composer2, StringProvider.$stable);
            int iAccess$icon = ConversationKebabKt.access$icon(headerMenuItem);
            String strAccess$badgeText = ConversationKebabKt.access$badgeText(headerMenuItem);
            boolean zAccess$shouldShowUnreadDot = ConversationKebabKt.access$shouldShowUnreadDot(headerMenuItem);
            composer2.mo4221N(1730714746);
            boolean zMo4220M = composer2.mo4220M(function1) | composer2.mo4220M(headerMenuItem) | composer2.mo4220M(function12);
            Object objMo4229g = composer2.mo4229g();
            if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
                objMo4229g = new C5405f(mutableState, function1, headerMenuItem, function12);
                composer2.mo4214G(objMo4229g);
            }
            composer2.mo4213F();
            HeaderMenuItemRowKt.m22222HeaderMenuItemRow6RhP_wg(null, text, iAccess$icon, strAccess$badgeText, true, zAccess$shouldShowUnreadDot, true, (Function0) objMo4229g, headerMenuItem.getEnabled(), j, composer2, 1597440, 1);
            composer2 = composer;
            function12 = function12;
            mutableState = mutableState;
        }
    }
}
