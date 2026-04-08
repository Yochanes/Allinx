package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SpliceScheduleCommand extends SpliceCommand {

    /* JADX INFO: renamed from: a */
    public final List f28545a;

    /* JADX INFO: compiled from: Proguard */
    public static final class ComponentSplice {
    }

    /* JADX INFO: compiled from: Proguard */
    public static final class Event {

        /* JADX INFO: renamed from: a */
        public final List f28546a;

        public Event(ArrayList arrayList) {
            this.f28546a = Collections.unmodifiableList(arrayList);
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f28545a = Collections.unmodifiableList(arrayList);
    }
}
