package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public class BigDecimalMath {

    /* JADX INFO: compiled from: Proguard */
    public static class BigDecimalToDoubleRounder extends ToDoubleRounder<BigDecimal> {
        static final BigDecimalToDoubleRounder INSTANCE = new BigDecimalToDoubleRounder();

        private BigDecimalToDoubleRounder() {
        }

        @Override // com.google.common.math.ToDoubleRounder
        public /* bridge */ /* synthetic */ Number minus(Number number, Number number2) {
            return minus((BigDecimal) number, (BigDecimal) number2);
        }

        @Override // com.google.common.math.ToDoubleRounder
        public /* bridge */ /* synthetic */ double roundToDoubleArbitrarily(Number number) {
            return roundToDoubleArbitrarily((BigDecimal) number);
        }

        @Override // com.google.common.math.ToDoubleRounder
        public /* bridge */ /* synthetic */ int sign(Number number) {
            return sign((BigDecimal) number);
        }

        @Override // com.google.common.math.ToDoubleRounder
        public /* bridge */ /* synthetic */ Number toX(double d, RoundingMode roundingMode) {
            return toX(d, roundingMode);
        }

        public BigDecimal minus(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.subtract(bigDecimal2);
        }

        public double roundToDoubleArbitrarily(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        public int sign(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        @Override // com.google.common.math.ToDoubleRounder
        public BigDecimal toX(double d, RoundingMode roundingMode) {
            return new BigDecimal(d);
        }
    }

    private BigDecimalMath() {
    }

    public static double roundToDouble(BigDecimal bigDecimal, RoundingMode roundingMode) {
        return BigDecimalToDoubleRounder.INSTANCE.roundToDouble(bigDecimal, roundingMode);
    }
}
