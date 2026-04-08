package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m18302d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", "", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "settings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "lifecycleServiceBinder", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/sessions/settings/SessionsSettings;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;)V", "Companion", "com.google.firebase-firebase-sessions"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class FirebaseSessions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "FirebaseSessions";

    @NotNull
    private final FirebaseApp firebaseApp;

    @NotNull
    private final SessionsSettings settings;

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1 */
    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m18302d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m18303k = 3, m18304mv = {1, 8, 0}, m18306xi = 48)
    @DebugMetadata(m18558c = "com.google.firebase.sessions.FirebaseSessions$1", m18559f = "FirebaseSessions.kt", m18560l = {45, 49}, m18561m = "invokeSuspend")
    @SourceDebugExtension
    public static final class C47591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $backgroundDispatcher;
        final /* synthetic */ SessionLifecycleServiceBinder $lifecycleServiceBinder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47591(CoroutineContext coroutineContext, SessionLifecycleServiceBinder sessionLifecycleServiceBinder, Continuation<? super C47591> continuation) {
            super(2, continuation);
            this.$backgroundDispatcher = coroutineContext;
            this.$lifecycleServiceBinder = sessionLifecycleServiceBinder;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m15261a(String str, FirebaseOptions firebaseOptions) {
            invokeSuspend$lambda$1(str, firebaseOptions);
        }

        private static final void invokeSuspend$lambda$1(String str, FirebaseOptions firebaseOptions) {
            Log.w(FirebaseSessions.TAG, "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient(null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FirebaseSessions.this.new C47591(this.$backgroundDispatcher, this.$lifecycleServiceBinder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((CoroutineScope) obj, (Continuation<? super Unit>) obj2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        
            if (r6.updateSettings(r5) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@NotNull Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i = this.label;
            if (i == 0) {
                ResultKt.m18313b(obj);
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                this.label = 1;
                obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m18313b(obj);
                if (FirebaseSessions.access$getSettings$p(FirebaseSessions.this).getSessionsEnabled()) {
                    SessionLifecycleClient sessionLifecycleClient = new SessionLifecycleClient(this.$backgroundDispatcher);
                    sessionLifecycleClient.bindToService(this.$lifecycleServiceBinder);
                    SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient(sessionLifecycleClient);
                    FirebaseSessions.access$getFirebaseApp$p(FirebaseSessions.this).addLifecycleEventListener(new C4769a());
                } else {
                    Log.d(FirebaseSessions.TAG, "Sessions SDK disabled. Not listening to lifecycle events.");
                }
                return Unit.f51459a;
            }
            ResultKt.m18313b(obj);
            Collection collectionValues = ((Map) obj).values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                        SessionsSettings sessionsSettingsAccess$getSettings$p = FirebaseSessions.access$getSettings$p(FirebaseSessions.this);
                        this.label = 2;
                    }
                }
            }
            Log.d(FirebaseSessions.TAG, "No Sessions subscribers. Not listening to lifecycle events.");
            return Unit.f51459a;
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C47591) create(coroutineScope, continuation)).invokeSuspend(Unit.f51459a);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m18302d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", "", "()V", "TAG", "", "instance", "Lcom/google/firebase/sessions/FirebaseSessions;", "getInstance", "()Lcom/google/firebase/sessions/FirebaseSessions;", "com.google.firebase-firebase-sessions"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FirebaseSessions getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(FirebaseSessions.class);
            Intrinsics.m18598f(obj, "Firebase.app[FirebaseSessions::class.java]");
            return (FirebaseSessions) obj;
        }

        private Companion() {
        }
    }

    public FirebaseSessions(@NotNull FirebaseApp firebaseApp, @NotNull SessionsSettings settings, @NotNull CoroutineContext backgroundDispatcher, @NotNull SessionLifecycleServiceBinder lifecycleServiceBinder) {
        Intrinsics.m18599g(firebaseApp, "firebaseApp");
        Intrinsics.m18599g(settings, "settings");
        Intrinsics.m18599g(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.m18599g(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.firebaseApp = firebaseApp;
        this.settings = settings;
        Log.d(TAG, "Initializing Firebase Sessions SDK.");
        Context applicationContext = firebaseApp.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(SessionsActivityLifecycleCallbacks.INSTANCE);
            BuildersKt.m20507c(CoroutineScopeKt.m20560a(backgroundDispatcher), null, null, new C47591(backgroundDispatcher, lifecycleServiceBinder, null), 3);
        } else {
            Log.e(TAG, "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }

    public static final /* synthetic */ FirebaseApp access$getFirebaseApp$p(FirebaseSessions firebaseSessions) {
        return firebaseSessions.firebaseApp;
    }

    public static final /* synthetic */ SessionsSettings access$getSettings$p(FirebaseSessions firebaseSessions) {
        return firebaseSessions.settings;
    }
}
