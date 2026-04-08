package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.core.content.res.ResourcesCompat;
import java.io.InputStream;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
class ResourcesWrapper extends Resources {
    /* JADX INFO: renamed from: a */
    public final Drawable m681a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public int getColor(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        throw null;
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        throw null;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2) {
        ThreadLocal threadLocal = ResourcesCompat.f23171a;
        throw null;
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        throw null;
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        throw null;
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... objArr) {
        throw null;
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) {
        throw null;
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public String getString(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z2) {
        throw null;
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z2) {
        throw null;
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        throw null;
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) {
        throw null;
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        throw null;
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        throw null;
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i, Resources.Theme theme) {
        ThreadLocal threadLocal = ResourcesCompat.f23171a;
        throw null;
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) {
        throw null;
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... objArr) {
        throw null;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i, CharSequence charSequence) {
        throw null;
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z2) {
        throw null;
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) {
        throw null;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        ThreadLocal threadLocal = ResourcesCompat.f23171a;
        throw null;
    }
}
