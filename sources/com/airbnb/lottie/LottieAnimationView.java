package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.utils.LottieValueAnimator;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f34028d = 0;

    /* JADX INFO: renamed from: a */
    public LottieListener f34029a;

    /* JADX INFO: renamed from: b */
    public String f34030b;

    /* JADX INFO: renamed from: c */
    public boolean f34031c;

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$1 */
    /* JADX INFO: compiled from: Proguard */
    class C23851 extends LottieValueCallback<Object> {
        @Override // com.airbnb.lottie.value.LottieValueCallback
        /* JADX INFO: renamed from: a */
        public final Object mo12553a(LottieFrameInfo lottieFrameInfo) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C23861();

        /* JADX INFO: renamed from: a */
        public String f34032a;

        /* JADX INFO: renamed from: b */
        public float f34033b;

        /* JADX INFO: renamed from: c */
        public boolean f34034c;

        /* JADX INFO: renamed from: d */
        public String f34035d;

        /* JADX INFO: renamed from: f */
        public int f34036f;

        /* JADX INFO: renamed from: g */
        public int f34037g;

        /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$1 */
        /* JADX INFO: compiled from: Proguard */
        public class C23861 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f34032a = parcel.readString();
                savedState.f34033b = parcel.readFloat();
                savedState.f34034c = parcel.readInt() == 1;
                savedState.f34035d = parcel.readString();
                savedState.f34036f = parcel.readInt();
                savedState.f34037g = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f34032a);
            parcel.writeFloat(this.f34033b);
            parcel.writeInt(this.f34034c ? 1 : 0);
            parcel.writeString(this.f34035d);
            parcel.writeInt(this.f34036f);
            parcel.writeInt(this.f34037g);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Proguard */
    public static final class UserActionTaken {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ UserActionTaken[] f34038a = {new UserActionTaken("SET_ANIMATION", 0), new UserActionTaken("SET_PROGRESS", 1), new UserActionTaken("SET_REPEAT_MODE", 2), new UserActionTaken("SET_REPEAT_COUNT", 3), new UserActionTaken("SET_IMAGE_ASSETS", 4), new UserActionTaken("PLAY_OPTION", 5)};

        /* JADX INFO: Fake field, exist only in values array */
        UserActionTaken EF5;

        public static UserActionTaken valueOf(String str) {
            return (UserActionTaken) Enum.valueOf(UserActionTaken.class, str);
        }

        public static UserActionTaken[] values() {
            return (UserActionTaken[]) f34038a.clone();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class WeakFailureListener implements LottieListener<Throwable> {
        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class WeakSuccessListener implements LottieListener<LottieComposition> {
        @Override // com.airbnb.lottie.LottieListener
        public final void onResult(Object obj) {
            throw null;
        }
    }

    private void setCompositionTask(LottieTask<LottieComposition> lottieTask) {
        throw null;
    }

    public AsyncUpdates getAsyncUpdates() {
        throw null;
    }

    public boolean getAsyncUpdatesEnabled() {
        throw null;
    }

    public boolean getClipToCompositionBounds() {
        throw null;
    }

    @Nullable
    public LottieComposition getComposition() {
        return null;
    }

    public long getDuration() {
        return 0L;
    }

    public int getFrame() {
        throw null;
    }

    @Nullable
    public String getImageAssetsFolder() {
        throw null;
    }

    public boolean getMaintainOriginalImageBounds() {
        throw null;
    }

    public float getMaxFrame() {
        throw null;
    }

    public float getMinFrame() {
        throw null;
    }

    @Nullable
    public PerformanceTracker getPerformanceTracker() {
        throw null;
    }

    @FloatRange
    public float getProgress() {
        throw null;
    }

    public RenderMode getRenderMode() {
        throw null;
    }

    public int getRepeatCount() {
        throw null;
    }

    public int getRepeatMode() {
        throw null;
    }

    public float getSpeed() {
        throw null;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof LottieDrawable) {
            boolean z2 = ((LottieDrawable) drawable).f34087v;
            RenderMode renderMode = RenderMode.f34110c;
            if ((z2 ? renderMode : RenderMode.f34109b) == renderMode) {
                throw null;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (getDrawable() == null) {
            super.invalidateDrawable(null);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        isInEditMode();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f34030b = savedState.f34032a;
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        new SavedState(super.onSaveInstanceState()).f34032a = this.f34030b;
        throw null;
    }

    public void setAnimation(@RawRes int i) {
        LottieTask<LottieComposition> lottieTaskM12561e;
        this.f34030b = null;
        if (isInEditMode()) {
            lottieTaskM12561e = new LottieTask<>(new CallableC2406d(this, i), true);
        } else if (this.f34031c) {
            Context context = getContext();
            lottieTaskM12561e = LottieCompositionFactory.m12561e(context, i, LottieCompositionFactory.m12566j(context, i));
        } else {
            lottieTaskM12561e = LottieCompositionFactory.m12561e(getContext(), i, null);
        }
        setCompositionTask(lottieTaskM12561e);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(LottieCompositionFactory.m12557a(null, new CallableC2401b(1, byteArrayInputStream, null), new RunnableC2408f(byteArrayInputStream, 0)));
    }

    public void setAnimationFromUrl(String str) {
        LottieTask<LottieComposition> lottieTaskM12557a;
        if (this.f34031c) {
            Context context = getContext();
            HashMap map = LottieCompositionFactory.f34054a;
            String strM13j = AbstractC0000a.m13j("url_", str);
            lottieTaskM12557a = LottieCompositionFactory.m12557a(strM13j, new CallableC2407e(0, context, str, strM13j), null);
        } else {
            lottieTaskM12557a = LottieCompositionFactory.m12557a(null, new CallableC2407e(0, getContext(), str, null), null);
        }
        setCompositionTask(lottieTaskM12557a);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        throw null;
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        throw null;
    }

    public void setCacheComposition(boolean z2) {
        this.f34031c = z2;
    }

    public void setClipToCompositionBounds(boolean z2) {
        throw null;
    }

    public void setComposition(@NonNull LottieComposition lottieComposition) {
        throw null;
    }

    public void setDefaultFontFileExtension(String str) {
        throw null;
    }

    public void setFailureListener(@Nullable LottieListener<Throwable> lottieListener) {
        this.f34029a = lottieListener;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        throw null;
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        throw null;
    }

    public void setFrame(int i) {
        throw null;
    }

    public void setIgnoreDisabledSystemAnimations(boolean z2) {
        throw null;
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        throw null;
    }

    public void setImageAssetsFolder(String str) {
        throw null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        throw null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        throw null;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        throw null;
    }

    public void setMaintainOriginalImageBounds(boolean z2) {
        throw null;
    }

    public void setMaxFrame(int i) {
        throw null;
    }

    public void setMaxProgress(@FloatRange float f) {
        throw null;
    }

    public void setMinAndMaxFrame(String str) {
        throw null;
    }

    public void setMinFrame(int i) {
        throw null;
    }

    public void setMinProgress(float f) {
        throw null;
    }

    public void setOutlineMasksAndMattes(boolean z2) {
        throw null;
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        throw null;
    }

    public void setProgress(@FloatRange float f) {
        throw null;
    }

    public void setRenderMode(RenderMode renderMode) {
        throw null;
    }

    public void setRepeatCount(int i) {
        throw null;
    }

    public void setRepeatMode(int i) {
        throw null;
    }

    public void setSafeMode(boolean z2) {
        throw null;
    }

    public void setSpeed(float f) {
        throw null;
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        throw null;
    }

    public void setUseCompositionFrameRate(boolean z2) {
        throw null;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        drawable.getClass();
        if (drawable instanceof LottieDrawable) {
            LottieDrawable lottieDrawable = (LottieDrawable) drawable;
            LottieValueAnimator lottieValueAnimator = lottieDrawable.f34072b;
            if (lottieValueAnimator == null ? false : lottieValueAnimator.f34877r) {
                lottieDrawable.m12572f();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        throw null;
    }

    public void setMinFrame(String str) {
        throw null;
    }

    public void setAnimation(String str) {
        LottieTask<LottieComposition> lottieTaskM12557a;
        this.f34030b = str;
        if (isInEditMode()) {
            lottieTaskM12557a = new LottieTask<>(new CallableC2401b(0, this, str), true);
        } else if (this.f34031c) {
            Context context = getContext();
            HashMap map = LottieCompositionFactory.f34054a;
            String strM13j = AbstractC0000a.m13j("asset_", str);
            lottieTaskM12557a = LottieCompositionFactory.m12557a(strM13j, new CallableC2407e(1, context.getApplicationContext(), str, strM13j), null);
        } else {
            Context context2 = getContext();
            HashMap map2 = LottieCompositionFactory.f34054a;
            lottieTaskM12557a = LottieCompositionFactory.m12557a(null, new CallableC2407e(1, context2.getApplicationContext(), str, null), null);
        }
        setCompositionTask(lottieTaskM12557a);
    }

    public void setFallbackResource(@DrawableRes int i) {
    }
}
