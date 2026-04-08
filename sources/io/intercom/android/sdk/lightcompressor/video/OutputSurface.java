package io.intercom.android.sdk.lightcompressor.video;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u0012\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m18302d2 = {"Lio/intercom/android/sdk/lightcompressor/video/OutputSurface;", "Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;", "<init>", "()V", "mSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "mSurface", "Landroid/view/Surface;", "mFrameSyncObject", "Ljava/lang/Object;", "mFrameAvailable", "", "mTextureRender", "Lio/intercom/android/sdk/lightcompressor/video/TextureRenderer;", "setup", "", "release", "getSurface", "awaitNewImage", "drawImage", "onFrameAvailable", "p0", "intercom-sdk-lightcompressor_release"}, m18303k = 1, m18304mv = {2, 0, 0}, m18306xi = 48)
public final class OutputSurface implements SurfaceTexture.OnFrameAvailableListener {
    private boolean mFrameAvailable;

    @NotNull
    private final Object mFrameSyncObject = new Object();

    @Nullable
    private Surface mSurface;

    @Nullable
    private SurfaceTexture mSurfaceTexture;

    @Nullable
    private TextureRenderer mTextureRender;

    public OutputSurface() {
        setup();
    }

    private final void setup() {
        TextureRenderer textureRenderer = new TextureRenderer();
        this.mTextureRender = textureRenderer;
        textureRenderer.surfaceCreated();
        SurfaceTexture surfaceTexture = new SurfaceTexture(textureRenderer.getMTextureID());
        this.mSurfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.mSurface = new Surface(this.mSurfaceTexture);
    }

    public final void awaitNewImage() {
        synchronized (this.mFrameSyncObject) {
            while (!this.mFrameAvailable) {
                try {
                    this.mFrameSyncObject.wait(100);
                    if (!this.mFrameAvailable) {
                        throw new RuntimeException("Surface frame wait timed out");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            this.mFrameAvailable = false;
        }
        TextureRenderer textureRenderer = this.mTextureRender;
        if (textureRenderer != null) {
            textureRenderer.checkGlError("before updateTexImage");
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.updateTexImage();
        }
    }

    public final void drawImage() {
        TextureRenderer textureRenderer = this.mTextureRender;
        if (textureRenderer != null) {
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            Intrinsics.m18596d(surfaceTexture);
            textureRenderer.drawFrame(surfaceTexture);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getSurface, reason: from getter */
    public final Surface getMSurface() {
        return this.mSurface;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(@Nullable SurfaceTexture p0) {
        synchronized (this.mFrameSyncObject) {
            if (this.mFrameAvailable) {
                throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
            }
            this.mFrameAvailable = true;
            this.mFrameSyncObject.notifyAll();
        }
    }

    public final void release() {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
        }
        this.mTextureRender = null;
        this.mSurface = null;
        this.mSurfaceTexture = null;
    }
}
