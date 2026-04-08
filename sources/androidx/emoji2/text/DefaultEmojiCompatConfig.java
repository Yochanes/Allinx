package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.provider.FontRequest;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultEmojiCompatConfig {

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class DefaultEmojiCompatConfigFactory {

        /* JADX INFO: renamed from: a */
        public final DefaultEmojiCompatConfigHelper f24275a;

        public DefaultEmojiCompatConfigFactory() {
            this.f24275a = Build.VERSION.SDK_INT >= 28 ? new DefaultEmojiCompatConfigHelper_API28() : new DefaultEmojiCompatConfigHelper_API19();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RestrictTo
    public static class DefaultEmojiCompatConfigHelper {
        /* JADX INFO: renamed from: a */
        public ProviderInfo mo8779a(ResolveInfo resolveInfo) {
            throw new IllegalStateException("Unable to get provider info prior to API 19");
        }

        /* JADX INFO: renamed from: b */
        public Signature[] mo8780b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        /* JADX INFO: renamed from: c */
        public List mo8781c(PackageManager packageManager, Intent intent) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @RestrictTo
    public static class DefaultEmojiCompatConfigHelper_API19 extends DefaultEmojiCompatConfigHelper {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        /* JADX INFO: renamed from: a */
        public final ProviderInfo mo8779a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        /* JADX INFO: renamed from: c */
        public final List mo8781c(PackageManager packageManager, Intent intent) {
            return packageManager.queryIntentContentProviders(intent, 0);
        }
    }

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    @RestrictTo
    public static class DefaultEmojiCompatConfigHelper_API28 extends DefaultEmojiCompatConfigHelper_API19 {
        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        /* JADX INFO: renamed from: b */
        public final Signature[] mo8780b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX INFO: renamed from: a */
    public static FontRequestEmojiCompatConfig m8778a(Context context) {
        ProviderInfo providerInfoMo8779a;
        FontRequest fontRequest;
        ApplicationInfo applicationInfo;
        DefaultEmojiCompatConfigFactory defaultEmojiCompatConfigFactory = new DefaultEmojiCompatConfigFactory();
        PackageManager packageManager = context.getPackageManager();
        Preconditions.m7698e(packageManager, "Package manager required to locate emoji font provider");
        Intent intent = new Intent("androidx.content.action.LOAD_EMOJI_FONT");
        DefaultEmojiCompatConfigHelper defaultEmojiCompatConfigHelper = defaultEmojiCompatConfigFactory.f24275a;
        Iterator it = defaultEmojiCompatConfigHelper.mo8781c(packageManager, intent).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfoMo8779a = null;
                break;
            }
            providerInfoMo8779a = defaultEmojiCompatConfigHelper.mo8779a((ResolveInfo) it.next());
            if (providerInfoMo8779a != null && (applicationInfo = providerInfoMo8779a.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfoMo8779a == null) {
            fontRequest = null;
        } else {
            try {
                String str = providerInfoMo8779a.authority;
                String str2 = providerInfoMo8779a.packageName;
                Signature[] signatureArrMo8780b = defaultEmojiCompatConfigHelper.mo8780b(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo8780b) {
                    arrayList.add(signature.toByteArray());
                }
                fontRequest = new FontRequest(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                fontRequest = null;
            }
        }
        if (fontRequest == null) {
            return null;
        }
        return new FontRequestEmojiCompatConfig(new FontRequestEmojiCompatConfig.FontRequestMetadataLoader(context, fontRequest));
    }
}
