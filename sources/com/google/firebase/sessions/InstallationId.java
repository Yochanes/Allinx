package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.tasks.TasksKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m18301d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, m18302d2 = {"Lcom/google/firebase/sessions/InstallationId;", "", "fid", "", "authToken", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "getFid", "Companion", "com.google.firebase-firebase-sessions"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
public final class InstallationId {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "InstallationId";

    @NotNull
    private final String authToken;

    @NotNull
    private final String fid;

    /* JADX INFO: compiled from: Proguard */
    @Metadata(m18301d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m18302d2 = {"Lcom/google/firebase/sessions/InstallationId$Companion;", "", "()V", "TAG", "", "create", "Lcom/google/firebase/sessions/InstallationId;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "(Lcom/google/firebase/installations/FirebaseInstallationsApi;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m18303k = 1, m18304mv = {1, 8, 0}, m18306xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [com.google.firebase.installations.FirebaseInstallationsApi] */
        /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.installations.FirebaseInstallationsApi, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object create(@NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull Continuation<? super InstallationId> continuation) {
            InstallationId$Companion$create$1 installationId$Companion$create$1;
            ?? r10;
            String str;
            ?? r9;
            if (continuation instanceof InstallationId$Companion$create$1) {
                installationId$Companion$create$1 = (InstallationId$Companion$create$1) continuation;
                int i = installationId$Companion$create$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    installationId$Companion$create$1.label = i - Integer.MIN_VALUE;
                } else {
                    installationId$Companion$create$1 = new InstallationId$Companion$create$1(this, continuation);
                }
            }
            Object objM20917a = installationId$Companion$create$1.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f51584a;
            int i2 = installationId$Companion$create$1.label;
            String str2 = "";
            try {
                try {
                } catch (Exception e) {
                    Log.w(InstallationId.TAG, "Error getting authentication token.", e);
                    r10 = firebaseInstallationsApi;
                    str = "";
                }
            } catch (Exception e2) {
                Log.w(InstallationId.TAG, "Error getting Firebase installation id .", e2);
                r9 = firebaseInstallationsApi;
            }
            if (i2 == 0) {
                ResultKt.m18313b(objM20917a);
                Task<InstallationTokenResult> token = firebaseInstallationsApi.getToken(false);
                Intrinsics.m18598f(token, "firebaseInstallations.getToken(false)");
                installationId$Companion$create$1.L$0 = firebaseInstallationsApi;
                installationId$Companion$create$1.label = 1;
                objM20917a = TasksKt.m20917a(token, installationId$Companion$create$1);
                firebaseInstallationsApi = firebaseInstallationsApi;
                if (objM20917a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str3 = (String) installationId$Companion$create$1.L$0;
                    ResultKt.m18313b(objM20917a);
                    firebaseInstallationsApi = str3;
                    Intrinsics.m18598f(objM20917a, "{\n          firebaseInst…ions.id.await()\n        }");
                    str2 = (String) objM20917a;
                    r9 = firebaseInstallationsApi;
                    return new InstallationId(str2, r9, null);
                }
                FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) installationId$Companion$create$1.L$0;
                ResultKt.m18313b(objM20917a);
                firebaseInstallationsApi = firebaseInstallationsApi2;
            }
            String token2 = ((InstallationTokenResult) objM20917a).getToken();
            Intrinsics.m18598f(token2, "{\n          firebaseInst…).await().token\n        }");
            r10 = firebaseInstallationsApi;
            str = token2;
            Task<String> id = r10.getId();
            Intrinsics.m18598f(id, "firebaseInstallations.id");
            installationId$Companion$create$1.L$0 = str;
            installationId$Companion$create$1.label = 2;
            objM20917a = TasksKt.m20917a(id, installationId$Companion$create$1);
            firebaseInstallationsApi = str;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InstallationId(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @NotNull
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final String getFid() {
        return this.fid;
    }

    private InstallationId(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }
}
