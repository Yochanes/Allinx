package me.jessyan.autosize.unit;

import me.jessyan.autosize.utils.Preconditions;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class UnitsManager {
    private float mDesignHeight;
    private float mDesignWidth;
    private boolean isSupportDP = true;
    private boolean isSupportSP = true;
    private Subunits mSupportSubunits = Subunits.NONE;
    private boolean isSupportScreenSizeDP = false;

    public float getDesignHeight() {
        return this.mDesignHeight;
    }

    public float getDesignWidth() {
        return this.mDesignWidth;
    }

    public Subunits getSupportSubunits() {
        return this.mSupportSubunits;
    }

    public boolean isSupportDP() {
        return this.isSupportDP;
    }

    public boolean isSupportSP() {
        return this.isSupportSP;
    }

    public boolean isSupportScreenSizeDP() {
        return this.isSupportScreenSizeDP;
    }

    public UnitsManager setDesignHeight(float f) {
        Preconditions.checkArgument(f > 0.0f, "designHeight must be > 0");
        this.mDesignHeight = f;
        return this;
    }

    public UnitsManager setDesignSize(float f, float f2) {
        setDesignWidth(f);
        setDesignHeight(f2);
        return this;
    }

    public UnitsManager setDesignWidth(float f) {
        Preconditions.checkArgument(f > 0.0f, "designWidth must be > 0");
        this.mDesignWidth = f;
        return this;
    }

    public UnitsManager setSupportDP(boolean z2) {
        this.isSupportDP = z2;
        return this;
    }

    public UnitsManager setSupportSP(boolean z2) {
        this.isSupportSP = z2;
        return this;
    }

    public UnitsManager setSupportScreenSizeDP(boolean z2) {
        this.isSupportScreenSizeDP = z2;
        return this;
    }

    public UnitsManager setSupportSubunits(Subunits subunits) {
        this.mSupportSubunits = (Subunits) Preconditions.checkNotNull(subunits, "The supportSubunits can not be null, use Subunits.NONE instead");
        return this;
    }
}
