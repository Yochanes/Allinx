package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.view.accessibility.AbstractC1465b;
import androidx.media3.common.C1724C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.exoplayer.analytics.AbstractC1797o;
import androidx.media3.exoplayer.analytics.C1795m;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.ExoMediaDrm;
import androidx.media3.extractor.mp4.PsshAtomUtil;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public final class FrameworkMediaDrm implements ExoMediaDrm {

    /* JADX INFO: renamed from: d */
    public static final C1795m f26835d = new C1795m(3);

    /* JADX INFO: renamed from: a */
    public final UUID f26836a;

    /* JADX INFO: renamed from: b */
    public final MediaDrm f26837b;

    /* JADX INFO: renamed from: c */
    public int f26838c;

    /* JADX INFO: compiled from: Proguard */
    @RequiresApi
    public static class Api31 {
    }

    public FrameworkMediaDrm(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = C1724C.f25100b;
        Assertions.m9461b(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f26836a = uuid;
        MediaDrm mediaDrm = new MediaDrm((Util.f25665a >= 27 || !uuid.equals(C1724C.f25101c)) ? uuid : uuid2);
        this.f26837b = mediaDrm;
        this.f26838c = 1;
        if (C1724C.f25102d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: a */
    public final Map mo10321a(byte[] bArr) {
        return this.f26837b.queryKeyStatus(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: b */
    public final ExoMediaDrm.ProvisionRequest mo10322b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f26837b.getProvisionRequest();
        return new ExoMediaDrm.ProvisionRequest(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: c */
    public final CryptoConfig mo10323c(byte[] bArr) {
        int i = Util.f25665a;
        UUID uuid = this.f26836a;
        if (i < 27 && Objects.equals(uuid, C1724C.f25101c)) {
            uuid = C1724C.f25100b;
        }
        return new FrameworkCryptoConfig(uuid, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: d */
    public final byte[] mo10324d() {
        return this.f26837b.openSession();
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: e */
    public final void mo10325e(byte[] bArr, byte[] bArr2) {
        this.f26837b.restoreKeys(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: f */
    public final void mo10326f(byte[] bArr) {
        this.f26837b.closeSession(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: g */
    public final byte[] mo10327g(byte[] bArr, byte[] bArr2) {
        if (C1724C.f25101c.equals(this.f26836a) && Util.f25665a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(Util.m9623n(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray(UserMetadata.KEYDATA_FILENAME);
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                Log.m9508d("ClearKeyUtil", "Failed to adjust response data: ".concat(Util.m9623n(bArr2)), e);
            }
        }
        return this.f26837b.provideKeyResponse(bArr, bArr2);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: h */
    public final void mo10328h(ExoMediaDrm.OnEventListener onEventListener) {
        this.f26837b.setOnEventListener(new C1824c(this, onEventListener));
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: i */
    public final void mo10329i(byte[] bArr) throws DeniedByServerException {
        this.f26837b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e0  */
    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ExoMediaDrm.KeyRequest mo10330j(byte[] bArr, List list, int i, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i2;
        DrmInitData.SchemeData schemeData;
        byte[] bArrM10931c;
        PsshAtomUtil.PsshAtom psshAtomM10930b;
        UUID uuid = this.f26836a;
        DrmInitData.SchemeData schemeData2 = null;
        if (list != null) {
            if (!C1724C.f25102d.equals(uuid)) {
                schemeData = (DrmInitData.SchemeData) list.get(0);
            } else if (Util.f25665a < 28 || list.size() <= 1) {
                for (i2 = 0; i2 < list.size(); i2++) {
                    DrmInitData.SchemeData schemeData3 = (DrmInitData.SchemeData) list.get(i2);
                    byte[] bArr3 = schemeData3.f25129f;
                    bArr3.getClass();
                    PsshAtomUtil.PsshAtom psshAtomM10930b2 = PsshAtomUtil.m10930b(bArr3);
                    int i3 = psshAtomM10930b2 == null ? -1 : psshAtomM10930b2.f28857b;
                    int i4 = Util.f25665a;
                    if ((i4 < 23 && i3 == 0) || (i4 >= 23 && i3 == 1)) {
                        schemeData = schemeData3;
                        break;
                    }
                }
                schemeData = (DrmInitData.SchemeData) list.get(0);
            } else {
                DrmInitData.SchemeData schemeData4 = (DrmInitData.SchemeData) list.get(0);
                int length = 0;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    DrmInitData.SchemeData schemeData5 = (DrmInitData.SchemeData) list.get(i5);
                    byte[] bArr4 = schemeData5.f25129f;
                    bArr4.getClass();
                    if (Objects.equals(schemeData5.f25128d, schemeData4.f25128d) && Objects.equals(schemeData5.f25127c, schemeData4.f25127c) && PsshAtomUtil.m10930b(bArr4) != null) {
                        length += bArr4.length;
                    } else {
                        while (i2 < list.size()) {
                        }
                        schemeData = (DrmInitData.SchemeData) list.get(0);
                    }
                }
                byte[] bArr5 = new byte[length];
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    byte[] bArr6 = ((DrmInitData.SchemeData) list.get(i7)).f25129f;
                    bArr6.getClass();
                    int length2 = bArr6.length;
                    System.arraycopy(bArr6, 0, bArr5, i6, length2);
                    i6 += length2;
                }
                schemeData = new DrmInitData.SchemeData(schemeData4.f25126b, schemeData4.f25127c, schemeData4.f25128d, bArr5);
            }
            byte[] bArrM10929a = schemeData.f25129f;
            bArrM10929a.getClass();
            UUID uuid2 = C1724C.f25103e;
            if (uuid2.equals(uuid)) {
                byte[] bArrM10931c2 = PsshAtomUtil.m10931c(uuid, bArrM10929a);
                if (bArrM10931c2 != null) {
                    bArrM10929a = bArrM10931c2;
                }
                ParsableByteArray parsableByteArray = new ParsableByteArray(bArrM10929a);
                int iM9556i = parsableByteArray.m9556i();
                short sM9558k = parsableByteArray.m9558k();
                short sM9558k2 = parsableByteArray.m9558k();
                if (sM9558k == 1 && sM9558k2 == 1) {
                    short sM9558k3 = parsableByteArray.m9558k();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strM9566s = parsableByteArray.m9566s(sM9558k3, charset);
                    if (!strM9566s.contains("<LA_URL>")) {
                        int iIndexOf = strM9566s.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            Log.m9511g("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strM9566s.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strM9566s.substring(iIndexOf);
                        int i8 = iM9556i + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i8);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i8);
                        byteBufferAllocate.putShort(sM9558k);
                        byteBufferAllocate.putShort(sM9558k2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrM10929a = byteBufferAllocate.array();
                    }
                } else {
                    Log.m9510f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrM10929a = PsshAtomUtil.m10929a(uuid2, null, bArrM10929a);
            }
            int i9 = Util.f25665a;
            if (i9 < 27 && Objects.equals(uuid, C1724C.f25101c) && (psshAtomM10930b = PsshAtomUtil.m10930b(bArrM10929a)) != null) {
                bArrM10929a = PsshAtomUtil.m10929a(C1724C.f25100b, psshAtomM10930b.f28859d, psshAtomM10930b.f28858c);
            }
            if (i9 >= 23 || !C1724C.f25102d.equals(uuid)) {
                if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                    String str3 = Build.MODEL;
                    if ("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) {
                        bArrM10931c = PsshAtomUtil.m10931c(uuid, bArrM10929a);
                        if (bArrM10931c == null) {
                        }
                        String str4 = schemeData.f25128d;
                        str = (i9 >= 26 && C1724C.f25101c.equals(uuid) && ("video/mp4".equals(str4) || "audio/mp4".equals(str4))) ? "cenc" : str4;
                        bArr2 = bArrM10931c;
                        schemeData2 = schemeData;
                    }
                }
                bArrM10931c = bArrM10929a;
                String str42 = schemeData.f25128d;
                if (i9 >= 26) {
                    str = (i9 >= 26 && C1724C.f25101c.equals(uuid) && ("video/mp4".equals(str42) || "audio/mp4".equals(str42))) ? "cenc" : str42;
                    bArr2 = bArrM10931c;
                    schemeData2 = schemeData;
                }
            }
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f26837b.getKeyRequest(bArr, bArr2, str, i, map);
        byte[] data = keyRequest.getData();
        if (C1724C.f25101c.equals(uuid) && Util.f25665a < 27) {
            data = Util.m9623n(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if (!"<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            if (Util.f25665a >= 33 && "https://default.url".equals(defaultUrl)) {
                String propertyString = this.f26837b.getPropertyString("version");
                if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                    defaultUrl = "";
                }
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && schemeData2 != null) {
            String str5 = schemeData2.f25127c;
            if (!TextUtils.isEmpty(str5)) {
                defaultUrl = str5;
            }
        }
        if (Util.f25665a >= 23) {
            keyRequest.getRequestType();
        }
        return new ExoMediaDrm.KeyRequest(defaultUrl, data);
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: k */
    public final void mo10333k(byte[] bArr, PlayerId playerId) {
        if (Util.f25665a >= 31) {
            try {
                MediaDrm mediaDrm = this.f26837b;
                LogSessionId logSessionIdM10144a = playerId.m10144a();
                AbstractC1797o.m10187h();
                if (AbstractC1797o.m10200u(logSessionIdM10144a)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponentM10185f = AbstractC1797o.m10185f(mediaDrm, bArr);
                playbackComponentM10185f.getClass();
                AbstractC1797o.m10197r(AbstractC1797o.m10186g(playbackComponentM10185f), logSessionIdM10144a);
            } catch (UnsupportedOperationException unused) {
                Log.m9511g("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: l */
    public final int mo10331l() {
        return 2;
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    /* JADX INFO: renamed from: m */
    public final boolean mo10332m(String str, byte[] bArr) throws Throwable {
        MediaCrypto mediaCrypto;
        boolean zEquals;
        int i = Util.f25665a;
        UUID uuid = this.f26836a;
        if (i >= 31) {
            boolean zEquals2 = uuid.equals(C1724C.f25102d);
            MediaDrm mediaDrm = this.f26837b;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(C1724C.f25101c);
            }
            if (zEquals) {
                return AbstractC1797o.m10199t(mediaDrm, str, AbstractC1465b.m8053a(mediaDrm, bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !Objects.equals(uuid, C1724C.f25101c)) ? uuid : C1724C.f25100b, bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return zRequiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z2 = !uuid.equals(C1724C.f25101c);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z2;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.drm.ExoMediaDrm
    public final synchronized void release() {
        int i = this.f26838c - 1;
        this.f26838c = i;
        if (i == 0) {
            this.f26837b.release();
        }
    }
}
