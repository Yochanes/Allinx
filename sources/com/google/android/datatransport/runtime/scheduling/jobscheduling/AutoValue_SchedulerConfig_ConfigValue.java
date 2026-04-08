package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {
    private final long delta;
    private final Set<SchedulerConfig.Flag> flags;
    private final long maxAllowedDelay;

    /* JADX INFO: compiled from: Proguard */
    public static final class Builder extends SchedulerConfig.ConfigValue.Builder {
        private Long delta;
        private Set<SchedulerConfig.Flag> flags;
        private Long maxAllowedDelay;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue build() {
            String strM2C = this.delta == null ? " delta" : "";
            if (this.maxAllowedDelay == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " maxAllowedDelay");
            }
            if (this.flags == null) {
                strM2C = AbstractC0000a.m2C(strM2C, " flags");
            }
            if (strM2C.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.delta.longValue(), this.maxAllowedDelay.longValue(), this.flags, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM2C));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setDelta(long j) {
            this.delta = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setFlags(Set<SchedulerConfig.Flag> set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.flags = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long j) {
            this.maxAllowedDelay = Long.valueOf(j);
            return this;
        }
    }

    public /* synthetic */ AutoValue_SchedulerConfig_ConfigValue(long j, long j2, Set set, C37071 c37071) {
        this(j, j2, set);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig.ConfigValue) {
            SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
            if (this.delta == configValue.getDelta() && this.maxAllowedDelay == configValue.getMaxAllowedDelay() && this.flags.equals(configValue.getFlags())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public long getDelta() {
        return this.delta;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public Set<SchedulerConfig.Flag> getFlags() {
        return this.flags;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public long getMaxAllowedDelay() {
        return this.maxAllowedDelay;
    }

    public int hashCode() {
        long j = this.delta;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.maxAllowedDelay;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.flags.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.delta + ", maxAllowedDelay=" + this.maxAllowedDelay + ", flags=" + this.flags + "}";
    }

    private AutoValue_SchedulerConfig_ConfigValue(long j, long j2, Set<SchedulerConfig.Flag> set) {
        this.delta = j;
        this.maxAllowedDelay = j2;
        this.flags = set;
    }
}
