package androidx.core.app;

import android.app.RemoteInput;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import io.intercom.android.sdk.p032m5.push.ConversationActionHandlerKt;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteInput {

    /* JADX INFO: renamed from: a */
    public final String f23098a;

    /* JADX INFO: renamed from: b */
    public final String f23099b;

    /* JADX INFO: renamed from: c */
    public final boolean f23100c;

    /* JADX INFO: renamed from: d */
    public final Bundle f23101d;

    /* JADX INFO: renamed from: e */
    public final HashSet f23102e;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api20Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api26Impl {
        /* JADX INFO: renamed from: a */
        public static void m7476a(RemoteInput.Builder builder, String str) {
            builder.setAllowDataType(str, true);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api28Impl {
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api29Impl {
        /* JADX INFO: renamed from: a */
        public static void m7477a(RemoteInput.Builder builder) {
            builder.setEditChoicesBeforeSending(0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder {

        /* JADX INFO: renamed from: b */
        public final HashSet f23104b = new HashSet();

        /* JADX INFO: renamed from: c */
        public final Bundle f23105c = new Bundle();

        /* JADX INFO: renamed from: d */
        public final boolean f23106d = true;

        /* JADX INFO: renamed from: a */
        public final String f23103a = ConversationActionHandlerKt.KEY_TEXT_REPLY;
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface EditChoicesBeforeSending {
    }

    /* JADX INFO: compiled from: Proguard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Source {
    }

    public RemoteInput(String str, String str2, boolean z2, Bundle bundle, HashSet hashSet) {
        this.f23098a = str;
        this.f23099b = str2;
        this.f23100c = z2;
        this.f23101d = bundle;
        this.f23102e = hashSet;
    }
}
