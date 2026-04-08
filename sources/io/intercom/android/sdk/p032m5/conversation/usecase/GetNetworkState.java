package io.intercom.android.sdk.p032m5.conversation.usecase;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.ConnectionResult;
import io.intercom.android.sdk.p032m5.conversation.states.NetworkState;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred
@Metadata(m18301d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m18302d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/GetNetworkState;", "", "networkConnectivityMonitor", "Lio/intercom/android/sdk/utilities/connectivity/NetworkConnectivityMonitor;", "<init>", "(Lio/intercom/android/sdk/utilities/connectivity/NetworkConnectivityMonitor;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class GetNetworkState {
    public static final int $stable = 8;

    @NotNull
    private final NetworkConnectivityMonitor networkConnectivityMonitor;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/intercom/android/sdk/m5/conversation/states/NetworkState;"}, m18303k = 3, m18304mv = {2, 0, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1", m18559f = "GetNetworkState.kt", m18560l = {ConnectionResult.API_DISABLED_FOR_CONNECTION}, m18561m = "invokeSuspend")
    public static final class C54641 extends SuspendLambda implements Function2<ProducerScope<? super NetworkState>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState$invoke$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: Proguard */
        @Metadata(m18301d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, m18302d2 = {"io/intercom/android/sdk/m5/conversation/usecase/GetNetworkState$invoke$1$1", "Lio/intercom/android/sdk/utilities/connectivity/NetworkConnectivityMonitor$ConnectivityEventListener;", "onDisconnect", "", "onReconnect", "intercom-sdk-base_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
        public static final class AnonymousClass1 implements NetworkConnectivityMonitor.ConnectivityEventListener {
            final /* synthetic */ ProducerScope<NetworkState> $$this$callbackFlow;

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(ProducerScope<? super NetworkState> producerScope) {
                this.$$this$callbackFlow = producerScope;
            }

            @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
            public void onDisconnect() {
                this.$$this$callbackFlow.mo11414v(NetworkState.Disconnected.INSTANCE);
            }

            @Override // io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor.ConnectivityEventListener
            public void onReconnect() {
                this.$$this$callbackFlow.mo11414v(NetworkState.Reconnected.INSTANCE);
            }
        }

        public C54641(Continuation<? super C54641> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Unit m16029a(GetNetworkState getNetworkState) {
            return invokeSuspend$lambda$0(getNetworkState);
        }

        private static final Unit invokeSuspend$lambda$0(GetNetworkState getNetworkState) {
            GetNetworkState.access$getNetworkConnectivityMonitor$p(getNetworkState).setListener(null);
            return Unit.f51459a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C54641 c54641 = GetNetworkState.this.new C54641(continuation);
            c54641.L$0 = obj;
            return c54641;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((ProducerScope<? super NetworkState>) obj, (Continuation<? super Unit>) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i = this.label;
            if (i == 0) {
                ResultKt.m18313b(obj);
                ProducerScope producerScope = (ProducerScope) this.L$0;
                GetNetworkState.access$getNetworkConnectivityMonitor$p(GetNetworkState.this).setListener(new AnonymousClass1(producerScope));
                C5477a c5477a = new C5477a(GetNetworkState.this);
                this.label = 1;
                if (ProduceKt.m20723a(producerScope, c5477a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj);
            }
            return Unit.f51459a;
        }

        public final Object invoke(ProducerScope<? super NetworkState> producerScope, Continuation<? super Unit> continuation) {
            return ((C54641) create(producerScope, continuation)).invokeSuspend(Unit.f51459a);
        }
    }

    public GetNetworkState(@NotNull NetworkConnectivityMonitor networkConnectivityMonitor) {
        Intrinsics.m18599g(networkConnectivityMonitor, "networkConnectivityMonitor");
        this.networkConnectivityMonitor = networkConnectivityMonitor;
    }

    public static final /* synthetic */ NetworkConnectivityMonitor access$getNetworkConnectivityMonitor$p(GetNetworkState getNetworkState) {
        return getNetworkState.networkConnectivityMonitor;
    }

    @NotNull
    public final Flow<NetworkState> invoke() {
        return FlowKt.m20744d(new C54641(null));
    }
}
