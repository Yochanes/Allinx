package io.intercom.android.sdk.tickets.list.p040ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.paging.HintReceiver;
import androidx.paging.PageStore;
import androidx.paging.PagingLogger;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems$pagingDataPresenter$1;
import io.intercom.android.sdk.p041ui.component.IntercomDividerKt;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TicketsScreenKt$TicketsScreenContent$2$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $onClick;
    final /* synthetic */ TicketsScreenUiState.Content $uiState;

    /* JADX WARN: Multi-variable type inference failed */
    public TicketsScreenKt$TicketsScreenContent$2$1(TicketsScreenUiState.Content content, Function1<? super String, Unit> function1) {
        this.$uiState = content;
        this.$onClick = function1;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m16681a(Function1 function1, TicketRowData ticketRowData) {
        return invoke$lambda$2$lambda$1$lambda$0(function1, ticketRowData);
    }

    private static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, TicketRowData data) {
        Intrinsics.m18599g(data, "$data");
        function1.invoke(data.getId());
        return Unit.f51459a;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((LazyItemScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f51459a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
        Object value;
        Object value2;
        Intrinsics.m18599g(items, "$this$items");
        if ((i2 & 112) == 0) {
            i2 |= composer.mo4232j(i) ? 32 : 16;
        }
        if ((i2 & 721) == 144 && composer.mo4242t()) {
            composer.mo4246x();
            return;
        }
        LazyPagingItems<TicketRowData> lazyPagingTickets = this.$uiState.getLazyPagingTickets();
        LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = lazyPagingTickets.f31381c;
        MutableStateFlow mutableStateFlow = lazyPagingItems$pagingDataPresenter$1.f31121j;
        do {
            value = mutableStateFlow.getValue();
            ((Boolean) value).getClass();
        } while (!mutableStateFlow.mo20775c(value, Boolean.TRUE));
        lazyPagingItems$pagingDataPresenter$1.f31119h = true;
        lazyPagingItems$pagingDataPresenter$1.f31120i = i;
        if (PagingLogger.m11396a(2)) {
            PagingLogger.m11397b(2, "Accessing item index[" + i + ']');
        }
        HintReceiver hintReceiver = lazyPagingItems$pagingDataPresenter$1.f31113b;
        if (hintReceiver != null) {
            hintReceiver.mo11338a(lazyPagingItems$pagingDataPresenter$1.f31115d.m11378a(i));
        }
        PageStore pageStore = lazyPagingItems$pagingDataPresenter$1.f31115d;
        if (i < 0) {
            pageStore.getClass();
        } else if (i < pageStore.getSize()) {
            int i3 = i - pageStore.f31058c;
            if (i3 >= 0 && i3 < pageStore.f31057b) {
                pageStore.m11379b(i3);
            }
            MutableStateFlow mutableStateFlow2 = lazyPagingItems$pagingDataPresenter$1.f31121j;
            do {
                value2 = mutableStateFlow2.getValue();
                ((Boolean) value2).getClass();
            } while (!mutableStateFlow2.mo20775c(value2, Boolean.FALSE));
            TicketRowData ticketRowData = (TicketRowData) lazyPagingTickets.m11424b().get(i);
            if (ticketRowData == null) {
                return;
            }
            Function1<String, Unit> function1 = this.$onClick;
            Modifier.Companion companion = Modifier.Companion.f17180a;
            composer.mo4221N(122186268);
            boolean zMo4220M = composer.mo4220M(function1) | composer.mo4220M(ticketRowData);
            Object objMo4229g = composer.mo4229g();
            if (zMo4220M || objMo4229g == Composer.Companion.f16228a) {
                objMo4229g = new C5796d(function1, ticketRowData);
                composer.mo4214G(objMo4229g);
            }
            composer.mo4213F();
            TicketRowKt.TicketRow(ClickableKt.m2441c(companion, false, null, (Function0) objMo4229g, 7), ticketRowData, null, false, composer, 0, 12);
            IntercomDividerKt.IntercomDivider(PaddingKt.m2797h(companion, 20, 0.0f, 2), composer, 6, 0);
            return;
        }
        StringBuilder sbM20q = AbstractC0000a.m20q(i, "Index: ", ", Size: ");
        sbM20q.append(pageStore.getSize());
        throw new IndexOutOfBoundsException(sbM20q.toString());
    }
}
