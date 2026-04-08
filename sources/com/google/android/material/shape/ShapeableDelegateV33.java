package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import p011a.AbstractC0025b;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi
class ShapeableDelegateV33 extends ShapeableDelegate {

    /* JADX INFO: renamed from: com.google.android.material.shape.ShapeableDelegateV33$1 */
    /* JADX INFO: compiled from: Proguard */
    public class C39651 extends ViewOutlineProvider {
        public C39651() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableDelegateV33.this.shapePath.isEmpty()) {
                return;
            }
            AbstractC0025b.m123o(outline, ShapeableDelegateV33.this.shapePath);
        }
    }

    public ShapeableDelegateV33(@NonNull View view) {
        initMaskOutlineProvider(view);
    }

    @DoNotInline
    private void initMaskOutlineProvider(View view) {
        view.setOutlineProvider(new C39651());
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public void invalidateClippingMethod(@NonNull View view) {
        view.setClipToOutline(!shouldUseCompatClipping());
        if (shouldUseCompatClipping()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public boolean shouldUseCompatClipping() {
        return this.forceCompatClippingEnabled;
    }
}
