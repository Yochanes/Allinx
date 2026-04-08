package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.impl.Config;
import androidx.compose.foundation.text.C0708a;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public class OptionsBundle implements Config {

    /* JADX INFO: renamed from: G */
    public static final C0281g f2749G;

    /* JADX INFO: renamed from: H */
    public static final OptionsBundle f2750H;

    /* JADX INFO: renamed from: F */
    public final TreeMap f2751F;

    static {
        C0281g c0281g = new C0281g(0);
        f2749G = c0281g;
        f2750H = new OptionsBundle(new TreeMap(c0281g));
    }

    public OptionsBundle(TreeMap treeMap) {
        this.f2751F = treeMap;
    }

    /* JADX INFO: renamed from: S */
    public static OptionsBundle m1511S(Config config) {
        if (OptionsBundle.class.equals(config.getClass())) {
            return (OptionsBundle) config;
        }
        TreeMap treeMap = new TreeMap(f2749G);
        for (Config.Option option : config.mo1467e()) {
            Set<Config.OptionPriority> setMo1470h = config.mo1470h(option);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : setMo1470h) {
                arrayMap.put(optionPriority, config.mo1466d(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new OptionsBundle(treeMap);
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: a */
    public final Object mo1464a(Config.Option option) {
        Map map = (Map) this.f2751F.get(option);
        if (map != null) {
            return map.get((Config.OptionPriority) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + option);
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: c */
    public final boolean mo1465c(Config.Option option) {
        return this.f2751F.containsKey(option);
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: d */
    public final Object mo1466d(Config.Option option, Config.OptionPriority optionPriority) {
        Map map = (Map) this.f2751F.get(option);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + option);
        }
        if (map.containsKey(optionPriority)) {
            return map.get(optionPriority);
        }
        throw new IllegalArgumentException("Option does not exist: " + option + " with priority=" + optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: e */
    public final Set mo1467e() {
        return Collections.unmodifiableSet(this.f2751F.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: f */
    public final Object mo1468f(Config.Option option, Object obj) {
        try {
            return mo1464a(option);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: g */
    public final Config.OptionPriority mo1469g(Config.Option option) {
        Map map = (Map) this.f2751F.get(option);
        if (map != null) {
            return (Config.OptionPriority) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + option);
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: h */
    public final Set mo1470h(Config.Option option) {
        Map map = (Map) this.f2751F.get(option);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    /* JADX INFO: renamed from: i */
    public final void mo1471i(C0708a c0708a) {
        for (Map.Entry entry : this.f2751F.tailMap(new AutoValue_Config_Option("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((Config.Option) entry.getKey()).mo1384c().startsWith("camera2.captureRequest.option.")) {
                return;
            }
            Config.Option option = (Config.Option) entry.getKey();
            CaptureRequestOptions.Builder builder = (CaptureRequestOptions.Builder) c0708a.f8768b;
            Config config = (Config) c0708a.f8769c;
            builder.f2168a.m1509V(option, config.mo1469g(option), config.mo1464a(option));
        }
    }
}
