package com.king.camera.scan.manager;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Vibrator;
import androidx.media3.exoplayer.analytics.AbstractC1797o;
import com.exchange.allin.R;
import com.king.logx.LogX;
import java.io.Closeable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public final class BeepManager implements MediaPlayer.OnErrorListener, Closeable {

    /* JADX INFO: renamed from: a */
    public final Context f43004a;

    /* JADX INFO: renamed from: b */
    public MediaPlayer f43005b = null;

    /* JADX INFO: renamed from: c */
    public Vibrator f43006c;

    public BeepManager(Context context) {
        this.f43004a = context;
        m15340a();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m15340a() {
        try {
            if (this.f43005b == null) {
                Context context = this.f43004a;
                MediaPlayer mediaPlayer = new MediaPlayer();
                try {
                    AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(R.raw.camera_scan_beep);
                    mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                    mediaPlayer.setOnErrorListener(this);
                    mediaPlayer.setLooping(false);
                    mediaPlayer.prepare();
                } catch (Exception e) {
                    LogX.m15355w(e);
                    mediaPlayer.release();
                    mediaPlayer = null;
                }
                this.f43005b = mediaPlayer;
            }
            if (this.f43006c == null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f43006c = AbstractC1797o.m10189j(AbstractC1797o.m10190k(this.f43004a.getSystemService("vibrator_manager")));
                } else {
                    this.f43006c = (Vibrator) this.f43004a.getSystemService("vibrator");
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            MediaPlayer mediaPlayer = this.f43005b;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.f43005b = null;
            }
        } catch (Exception e) {
            LogX.m15355w(e);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final synchronized boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        close();
        m15340a();
        return true;
    }
}
