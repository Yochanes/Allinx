package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi
public final class MutableOptionsBundle extends OptionsBundle implements MutableConfig {
    /* JADX INFO: renamed from: T */
    public static MutableOptionsBundle m1507T() {
        return new MutableOptionsBundle(new TreeMap(OptionsBundle.f2749G));
    }

    /* JADX INFO: renamed from: U */
    public static MutableOptionsBundle m1508U(Config config) {
        TreeMap treeMap = new TreeMap(OptionsBundle.f2749G);
        for (Config.Option option : config.mo1467e()) {
            Set<Config.OptionPriority> setMo1470h = config.mo1470h(option);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : setMo1470h) {
                arrayMap.put(optionPriority, config.mo1466d(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new MutableOptionsBundle(treeMap);
    }

    /* JADX INFO: renamed from: V */
    public final void m1509V(Config.Option option, Config.OptionPriority optionPriority, Object obj) {
        Config.OptionPriority optionPriority2;
        Config.OptionPriority optionPriority3;
        TreeMap treeMap = this.f2751F;
        Map map = (Map) treeMap.get(option);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(option, arrayMap);
            arrayMap.put(optionPriority, obj);
            return;
        }
        Config.OptionPriority optionPriority4 = (Config.OptionPriority) Collections.min(map.keySet());
        if (Objects.equals(map.get(optionPriority4), obj) || !((optionPriority4 == (optionPriority2 = Config.OptionPriority.f2684a) && optionPriority == optionPriority2) || (optionPriority4 == (optionPriority3 = Config.OptionPriority.f2685b) && optionPriority == optionPriority3))) {
            map.put(optionPriority, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + option.mo1384c() + ", existing value (" + optionPriority4 + ")=" + map.get(optionPriority4) + ", conflicting (" + optionPriority + ")=" + obj);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    /* JADX INFO: renamed from: u */
    public final void mo1506u(Config.Option option, Object obj) {
        m1509V(option, Config.OptionPriority.f2686c, obj);
    }
}
