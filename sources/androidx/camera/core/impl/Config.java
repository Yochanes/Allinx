package androidx.camera.core.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RequiresApi;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.compose.foundation.text.C0708a;
import com.google.auto.value.AutoValue;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public interface Config {

    /* JADX INFO: compiled from: Proguard */
    @AutoValue
    public static abstract class Option<T> {
        /* JADX INFO: renamed from: a */
        public static Option m1472a(Class cls, String str) {
            return new AutoValue_Config_Option(str, cls, null);
        }

        /* JADX INFO: renamed from: b */
        public static Option m1473b(String str, CaptureRequest.Key key) {
            return new AutoValue_Config_Option(str, Object.class, key);
        }

        /* JADX INFO: renamed from: c */
        public abstract String mo1384c();

        /* JADX INFO: renamed from: d */
        public abstract Object mo1385d();

        /* JADX INFO: renamed from: e */
        public abstract Class mo1386e();
    }

    /* JADX INFO: compiled from: Proguard */
    public interface OptionMatcher {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class OptionPriority {

        /* JADX INFO: renamed from: a */
        public static final OptionPriority f2684a;

        /* JADX INFO: renamed from: b */
        public static final OptionPriority f2685b;

        /* JADX INFO: renamed from: c */
        public static final OptionPriority f2686c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ OptionPriority[] f2687d;

        static {
            OptionPriority optionPriority = new OptionPriority("ALWAYS_OVERRIDE", 0);
            f2684a = optionPriority;
            OptionPriority optionPriority2 = new OptionPriority("REQUIRED", 1);
            f2685b = optionPriority2;
            OptionPriority optionPriority3 = new OptionPriority("OPTIONAL", 2);
            f2686c = optionPriority3;
            f2687d = new OptionPriority[]{optionPriority, optionPriority2, optionPriority3};
        }

        public static OptionPriority valueOf(String str) {
            return (OptionPriority) Enum.valueOf(OptionPriority.class, str);
        }

        public static OptionPriority[] values() {
            return (OptionPriority[]) f2687d.clone();
        }
    }

    /* JADX INFO: renamed from: I */
    static OptionsBundle m1462I(Config config, Config config2) {
        if (config == null && config2 == null) {
            return OptionsBundle.f2750H;
        }
        MutableOptionsBundle mutableOptionsBundleM1508U = config2 != null ? MutableOptionsBundle.m1508U(config2) : MutableOptionsBundle.m1507T();
        if (config != null) {
            Iterator it = config.mo1467e().iterator();
            while (it.hasNext()) {
                m1463Q(mutableOptionsBundleM1508U, config2, config, (Option) it.next());
            }
        }
        return OptionsBundle.m1511S(mutableOptionsBundleM1508U);
    }

    /* JADX INFO: renamed from: Q */
    static void m1463Q(MutableOptionsBundle mutableOptionsBundle, Config config, Config config2, Option option) {
        if (!Objects.equals(option, ImageOutputConfig.f2738o)) {
            mutableOptionsBundle.m1509V(option, config2.mo1469g(option), config2.mo1464a(option));
            return;
        }
        ResolutionSelector resolutionSelectorM1733a = (ResolutionSelector) config2.mo1468f(option, null);
        ResolutionSelector resolutionSelector = (ResolutionSelector) config.mo1468f(option, null);
        OptionPriority optionPriorityMo1469g = config2.mo1469g(option);
        if (resolutionSelectorM1733a == null) {
            resolutionSelectorM1733a = resolutionSelector;
        } else if (resolutionSelector != null) {
            ResolutionSelector.Builder builder = new ResolutionSelector.Builder();
            builder.f3181a = resolutionSelector.f3178a;
            builder.f3182b = resolutionSelector.f3179b;
            builder.f3183c = resolutionSelector.f3180c;
            AspectRatioStrategy aspectRatioStrategy = resolutionSelectorM1733a.f3178a;
            if (aspectRatioStrategy != null) {
                builder.f3181a = aspectRatioStrategy;
            }
            ResolutionStrategy resolutionStrategy = resolutionSelectorM1733a.f3179b;
            if (resolutionStrategy != null) {
                builder.f3182b = resolutionStrategy;
            }
            ResolutionFilter resolutionFilter = resolutionSelectorM1733a.f3180c;
            if (resolutionFilter != null) {
                builder.f3183c = resolutionFilter;
            }
            resolutionSelectorM1733a = builder.m1733a();
        }
        mutableOptionsBundle.m1509V(option, optionPriorityMo1469g, resolutionSelectorM1733a);
    }

    /* JADX INFO: renamed from: a */
    Object mo1464a(Option option);

    /* JADX INFO: renamed from: c */
    boolean mo1465c(Option option);

    /* JADX INFO: renamed from: d */
    Object mo1466d(Option option, OptionPriority optionPriority);

    /* JADX INFO: renamed from: e */
    Set mo1467e();

    /* JADX INFO: renamed from: f */
    Object mo1468f(Option option, Object obj);

    /* JADX INFO: renamed from: g */
    OptionPriority mo1469g(Option option);

    /* JADX INFO: renamed from: h */
    Set mo1470h(Option option);

    /* JADX INFO: renamed from: i */
    void mo1471i(C0708a c0708a);
}
