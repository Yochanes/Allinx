package com.google.firebase.sessions;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\b\u0000\u0018\u0000 $2\u00020\u0001:\u0002#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0010J \u0010\u0017\u001a\u0004\u0018\u00010\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001bH\u0002J\u0016\u0010 \u001a\u00020!2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0003J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006%"}, m18302d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient;", "", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "queuedMessages", "Ljava/util/concurrent/LinkedBlockingDeque;", "Landroid/os/Message;", "service", "Landroid/os/Messenger;", "serviceBound", "", "serviceConnection", "com/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1", "Lcom/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1;", "backgrounded", "", "bindToService", "sessionLifecycleServiceBinder", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "drainQueue", "", "foregrounded", "getLatestByCode", "messages", "", "msgCode", "", "queueMessage", "msg", "sendLifecycleEvent", "messageCode", "sendLifecycleEvents", "Lkotlinx/coroutines/Job;", "sendMessageToServer", "ClientUpdateHandler", "Companion", "com.google.firebase-firebase-sessions"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
@SourceDebugExtension
public final class SessionLifecycleClient {
    private static final int MAX_QUEUED_MESSAGES = 20;

    @NotNull
    public static final String TAG = "SessionLifecycleClient";

    @NotNull
    private final CoroutineContext backgroundDispatcher;

    @NotNull
    private final LinkedBlockingDeque<Message> queuedMessages;

    @Nullable
    private Messenger service;
    private boolean serviceBound;

    @NotNull
    private final SessionLifecycleClient$serviceConnection$1 serviceConnection;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m18302d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$ClientUpdateHandler;", "Landroid/os/Handler;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "handleSessionUpdate", "sessionId", "", "com.google.firebase-firebase-sessions"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class ClientUpdateHandler extends Handler {

        @NotNull
        private final CoroutineContext backgroundDispatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(@NotNull CoroutineContext backgroundDispatcher) {
            super(Looper.getMainLooper());
            Intrinsics.m18599g(backgroundDispatcher, "backgroundDispatcher");
            this.backgroundDispatcher = backgroundDispatcher;
        }

        private final void handleSessionUpdate(String sessionId) {
            Log.d(SessionLifecycleClient.TAG, "Session update received: " + sessionId);
            BuildersKt.m20507c(CoroutineScopeKt.m20560a(this.backgroundDispatcher), null, null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(sessionId, null), 3);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            String string;
            Intrinsics.m18599g(msg, "msg");
            if (msg.what != 3) {
                Log.w(SessionLifecycleClient.TAG, "Received unexpected event from the SessionLifecycleService: " + msg);
                super.handleMessage(msg);
                return;
            }
            Bundle data = msg.getData();
            if (data == null || (string = data.getString(SessionLifecycleService.SESSION_UPDATE_EXTRA)) == null) {
                string = "";
            }
            handleSessionUpdate(string);
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", m18559f = "SessionLifecycleClient.kt", m18560l = {151}, m18561m = "invokeSuspend")
    @SourceDebugExtension
    public static final class C47671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Message> $messages;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47671(List<Message> list, Continuation<? super C47671> continuation) {
            super(2, continuation);
            this.$messages = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionLifecycleClient.this.new C47671(this.$messages, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((CoroutineScope) obj, (Continuation<? super Unit>) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i = this.label;
            if (i == 0) {
                ResultKt.m18313b(obj);
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                this.label = 1;
                obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj);
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d(SessionLifecycleClient.TAG, "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection collectionValues = map.values();
                if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                    Log.d(SessionLifecycleClient.TAG, "Data Collection is disabled for all subscribers. Skipping this Event");
                } else {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                            List listM18449p0 = CollectionsKt.m18449p0(CollectionsKt.m18468z(CollectionsKt.m18422W(SessionLifecycleClient.access$getLatestByCode(SessionLifecycleClient.this, this.$messages, 2), SessionLifecycleClient.access$getLatestByCode(SessionLifecycleClient.this, this.$messages, 1))), new C4768x3150a97d());
                            SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
                            Iterator it2 = listM18449p0.iterator();
                            while (it2.hasNext()) {
                                SessionLifecycleClient.access$sendMessageToServer(sessionLifecycleClient, (Message) it2.next());
                            }
                        }
                    }
                    Log.d(SessionLifecycleClient.TAG, "Data Collection is disabled for all subscribers. Skipping this Event");
                }
            }
            return Unit.f51459a;
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47671) create(coroutineScope, continuation)).invokeSuspend(Unit.f51459a);
        }
    }

    public SessionLifecycleClient(@NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.m18599g(backgroundDispatcher, "backgroundDispatcher");
        this.backgroundDispatcher = backgroundDispatcher;
        this.queuedMessages = new LinkedBlockingDeque<>(20);
        this.serviceConnection = new SessionLifecycleClient$serviceConnection$1(this);
    }

    public static final /* synthetic */ List access$drainQueue(SessionLifecycleClient sessionLifecycleClient) {
        return sessionLifecycleClient.drainQueue();
    }

    public static final /* synthetic */ Message access$getLatestByCode(SessionLifecycleClient sessionLifecycleClient, List list, int i) {
        return sessionLifecycleClient.getLatestByCode(list, i);
    }

    public static final /* synthetic */ LinkedBlockingDeque access$getQueuedMessages$p(SessionLifecycleClient sessionLifecycleClient) {
        return sessionLifecycleClient.queuedMessages;
    }

    public static final /* synthetic */ Job access$sendLifecycleEvents(SessionLifecycleClient sessionLifecycleClient, List list) {
        return sessionLifecycleClient.sendLifecycleEvents(list);
    }

    public static final /* synthetic */ void access$sendMessageToServer(SessionLifecycleClient sessionLifecycleClient, Message message) {
        sessionLifecycleClient.sendMessageToServer(message);
    }

    public static final /* synthetic */ void access$setService$p(SessionLifecycleClient sessionLifecycleClient, Messenger messenger) {
        sessionLifecycleClient.service = messenger;
    }

    public static final /* synthetic */ void access$setServiceBound$p(SessionLifecycleClient sessionLifecycleClient, boolean z2) {
        sessionLifecycleClient.serviceBound = z2;
    }

    private final List<Message> drainQueue() {
        ArrayList arrayList = new ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    private final Message getLatestByCode(List<Message> messages, int msgCode) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : messages) {
            if (((Message) obj2).what == msgCode) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    private final void queueMessage(Message msg) {
        if (!this.queuedMessages.offer(msg)) {
            Log.d(TAG, "Failed to enqueue message " + msg.what + ". Dropping.");
            return;
        }
        Log.d(TAG, "Queued message " + msg.what + ". Queue size " + this.queuedMessages.size());
    }

    private final void sendLifecycleEvent(int messageCode) {
        List<Message> listDrainQueue = drainQueue();
        Message messageObtain = Message.obtain(null, messageCode, 0, 0);
        Intrinsics.m18598f(messageObtain, "obtain(null, messageCode, 0, 0)");
        listDrainQueue.add(messageObtain);
        sendLifecycleEvents(listDrainQueue);
    }

    @CanIgnoreReturnValue
    private final Job sendLifecycleEvents(List<Message> messages) {
        return BuildersKt.m20507c(CoroutineScopeKt.m20560a(this.backgroundDispatcher), null, null, new C47671(messages, null), 3);
    }

    private final void sendMessageToServer(Message msg) {
        if (this.service == null) {
            queueMessage(msg);
            return;
        }
        try {
            Log.d(TAG, "Sending lifecycle " + msg.what + " to service");
            Messenger messenger = this.service;
            if (messenger != null) {
                messenger.send(msg);
            }
        } catch (RemoteException e) {
            Log.w(TAG, "Unable to deliver message: " + msg.what, e);
            queueMessage(msg);
        }
    }

    public final void backgrounded() {
        sendLifecycleEvent(2);
    }

    public final void bindToService(@NotNull SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        Intrinsics.m18599g(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.bindToService(new Messenger(new ClientUpdateHandler(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void foregrounded() {
        sendLifecycleEvent(1);
    }
}
