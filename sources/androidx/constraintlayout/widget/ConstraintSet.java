package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import com.engagelab.privates.common.observer.MTObservable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.google.zxing.aztec.encoder.Encoder;
import com.google.zxing.pdf417.PDF417Common;
import io.intercom.android.sdk.models.carousel.Carousel;
import io.intercom.android.sdk.survey.SurveyViewModel;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import me.jessyan.retrofiturlmanager.BuildConfig;
import org.xmlpull.v1.XmlPullParserException;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintSet {

    /* JADX INFO: renamed from: h */
    public static final int[] f22719h = {0, 4, 8};

    /* JADX INFO: renamed from: i */
    public static final SparseIntArray f22720i;

    /* JADX INFO: renamed from: j */
    public static final SparseIntArray f22721j;

    /* JADX INFO: renamed from: a */
    public String f22722a;

    /* JADX INFO: renamed from: b */
    public String f22723b = "";

    /* JADX INFO: renamed from: c */
    public String[] f22724c = new String[0];

    /* JADX INFO: renamed from: d */
    public int f22725d = 0;

    /* JADX INFO: renamed from: e */
    public final HashMap f22726e = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f22727f = true;

    /* JADX INFO: renamed from: g */
    public final HashMap f22728g = new HashMap();

    /* JADX INFO: compiled from: Proguard */
    public static class Constraint {

        /* JADX INFO: renamed from: a */
        public int f22729a;

        /* JADX INFO: renamed from: b */
        public String f22730b;

        /* JADX INFO: renamed from: c */
        public final PropertySet f22731c;

        /* JADX INFO: renamed from: d */
        public final Motion f22732d;

        /* JADX INFO: renamed from: e */
        public final Layout f22733e;

        /* JADX INFO: renamed from: f */
        public final Transform f22734f;

        /* JADX INFO: renamed from: g */
        public HashMap f22735g;

        /* JADX INFO: renamed from: h */
        public Delta f22736h;

        /* JADX INFO: compiled from: Proguard */
        public static class Delta {

            /* JADX INFO: renamed from: a */
            public int[] f22737a;

            /* JADX INFO: renamed from: b */
            public int[] f22738b;

            /* JADX INFO: renamed from: c */
            public int f22739c;

            /* JADX INFO: renamed from: d */
            public int[] f22740d;

            /* JADX INFO: renamed from: e */
            public float[] f22741e;

            /* JADX INFO: renamed from: f */
            public int f22742f;

            /* JADX INFO: renamed from: g */
            public int[] f22743g;

            /* JADX INFO: renamed from: h */
            public String[] f22744h;

            /* JADX INFO: renamed from: i */
            public int f22745i;

            /* JADX INFO: renamed from: j */
            public int[] f22746j;

            /* JADX INFO: renamed from: k */
            public boolean[] f22747k;

            /* JADX INFO: renamed from: l */
            public int f22748l;

            /* JADX INFO: renamed from: a */
            public final void m7361a(float f, int i) {
                int i2 = this.f22742f;
                int[] iArr = this.f22740d;
                if (i2 >= iArr.length) {
                    this.f22740d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f22741e;
                    this.f22741e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f22740d;
                int i3 = this.f22742f;
                iArr2[i3] = i;
                float[] fArr2 = this.f22741e;
                this.f22742f = i3 + 1;
                fArr2[i3] = f;
            }

            /* JADX INFO: renamed from: b */
            public final void m7362b(int i, int i2) {
                int i3 = this.f22739c;
                int[] iArr = this.f22737a;
                if (i3 >= iArr.length) {
                    this.f22737a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f22738b;
                    this.f22738b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f22737a;
                int i4 = this.f22739c;
                iArr3[i4] = i;
                int[] iArr4 = this.f22738b;
                this.f22739c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* JADX INFO: renamed from: c */
            public final void m7363c(int i, String str) {
                int i2 = this.f22745i;
                int[] iArr = this.f22743g;
                if (i2 >= iArr.length) {
                    this.f22743g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f22744h;
                    this.f22744h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f22743g;
                int i3 = this.f22745i;
                iArr2[i3] = i;
                String[] strArr2 = this.f22744h;
                this.f22745i = i3 + 1;
                strArr2[i3] = str;
            }

            /* JADX INFO: renamed from: d */
            public final void m7364d(int i, boolean z2) {
                int i2 = this.f22748l;
                int[] iArr = this.f22746j;
                if (i2 >= iArr.length) {
                    this.f22746j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f22747k;
                    this.f22747k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f22746j;
                int i3 = this.f22748l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f22747k;
                this.f22748l = i3 + 1;
                zArr2[i3] = z2;
            }

            /* JADX INFO: renamed from: e */
            public final void m7365e(Constraint constraint) {
                for (int i = 0; i < this.f22739c; i++) {
                    int i2 = this.f22737a[i];
                    int i3 = this.f22738b[i];
                    int[] iArr = ConstraintSet.f22719h;
                    if (i2 == 6) {
                        constraint.f22733e.f22753D = i3;
                    } else if (i2 == 7) {
                        constraint.f22733e.f22754E = i3;
                    } else if (i2 == 8) {
                        constraint.f22733e.f22760K = i3;
                    } else if (i2 == 27) {
                        constraint.f22733e.f22755F = i3;
                    } else if (i2 == 28) {
                        constraint.f22733e.f22757H = i3;
                    } else if (i2 == 41) {
                        constraint.f22733e.f22772W = i3;
                    } else if (i2 == 42) {
                        constraint.f22733e.f22773X = i3;
                    } else if (i2 == 61) {
                        constraint.f22733e.f22750A = i3;
                    } else if (i2 == 62) {
                        constraint.f22733e.f22751B = i3;
                    } else if (i2 == 72) {
                        constraint.f22733e.f22789g0 = i3;
                    } else if (i2 == 73) {
                        constraint.f22733e.f22791h0 = i3;
                    } else if (i2 == 2) {
                        constraint.f22733e.f22759J = i3;
                    } else if (i2 == 31) {
                        constraint.f22733e.f22761L = i3;
                    } else if (i2 == 34) {
                        constraint.f22733e.f22758I = i3;
                    } else if (i2 == 38) {
                        constraint.f22729a = i3;
                    } else if (i2 == 64) {
                        constraint.f22732d.f22820b = i3;
                    } else if (i2 == 66) {
                        constraint.f22732d.f22824f = i3;
                    } else if (i2 == 76) {
                        constraint.f22732d.f22823e = i3;
                    } else if (i2 == 78) {
                        constraint.f22731c.f22834c = i3;
                    } else if (i2 == 97) {
                        constraint.f22733e.f22807p0 = i3;
                    } else if (i2 == 93) {
                        constraint.f22733e.f22762M = i3;
                    } else if (i2 != 94) {
                        switch (i2) {
                            case 11:
                                constraint.f22733e.f22766Q = i3;
                                break;
                            case TYPE_BYTES_VALUE:
                                constraint.f22733e.f22767R = i3;
                                break;
                            case 13:
                                constraint.f22733e.f22763N = i3;
                                break;
                            case 14:
                                constraint.f22733e.f22765P = i3;
                                break;
                            case 15:
                                constraint.f22733e.f22768S = i3;
                                break;
                            case 16:
                                constraint.f22733e.f22764O = i3;
                                break;
                            case 17:
                                constraint.f22733e.f22784e = i3;
                                break;
                            case 18:
                                constraint.f22733e.f22786f = i3;
                                break;
                            default:
                                switch (i2) {
                                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                                        constraint.f22733e.f22782d = i3;
                                        break;
                                    case 22:
                                        constraint.f22731c.f22833b = i3;
                                        break;
                                    case ConnectionResult.API_DISABLED /* 23 */:
                                        constraint.f22733e.f22780c = i3;
                                        break;
                                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                                        constraint.f22733e.f22756G = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                constraint.f22733e.f22774Y = i3;
                                                break;
                                            case 55:
                                                constraint.f22733e.f22775Z = i3;
                                                break;
                                            case 56:
                                                constraint.f22733e.f22777a0 = i3;
                                                break;
                                            case 57:
                                                constraint.f22733e.f22779b0 = i3;
                                                break;
                                            case 58:
                                                constraint.f22733e.f22781c0 = i3;
                                                break;
                                            case 59:
                                                constraint.f22733e.f22783d0 = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 82:
                                                        constraint.f22732d.f22821c = i3;
                                                        break;
                                                    case 83:
                                                        constraint.f22734f.f22846i = i3;
                                                        break;
                                                    case 84:
                                                        constraint.f22732d.f22828j = i3;
                                                        break;
                                                    default:
                                                        switch (i2) {
                                                            case 87:
                                                                break;
                                                            case 88:
                                                                constraint.f22732d.f22830l = i3;
                                                                break;
                                                            case 89:
                                                                constraint.f22732d.f22831m = i3;
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        constraint.f22733e.f22769T = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f22742f; i4++) {
                    int i5 = this.f22740d[i4];
                    float f = this.f22741e[i4];
                    int[] iArr2 = ConstraintSet.f22719h;
                    if (i5 == 19) {
                        constraint.f22733e.f22788g = f;
                    } else if (i5 == 20) {
                        constraint.f22733e.f22815x = f;
                    } else if (i5 == 37) {
                        constraint.f22733e.f22816y = f;
                    } else if (i5 == 60) {
                        constraint.f22734f.f22839b = f;
                    } else if (i5 == 63) {
                        constraint.f22733e.f22752C = f;
                    } else if (i5 == 79) {
                        constraint.f22732d.f22825g = f;
                    } else if (i5 == 85) {
                        constraint.f22732d.f22827i = f;
                    } else if (i5 != 87) {
                        if (i5 == 39) {
                            constraint.f22733e.f22771V = f;
                        } else if (i5 != 40) {
                            switch (i5) {
                                case 43:
                                    constraint.f22731c.f22835d = f;
                                    break;
                                case Carousel.ENTITY_TYPE /* 44 */:
                                    Transform transform = constraint.f22734f;
                                    transform.f22851n = f;
                                    transform.f22850m = true;
                                    break;
                                case 45:
                                    constraint.f22734f.f22840c = f;
                                    break;
                                case 46:
                                    constraint.f22734f.f22841d = f;
                                    break;
                                case 47:
                                    constraint.f22734f.f22842e = f;
                                    break;
                                case 48:
                                    constraint.f22734f.f22843f = f;
                                    break;
                                case 49:
                                    constraint.f22734f.f22844g = f;
                                    break;
                                case 50:
                                    constraint.f22734f.f22845h = f;
                                    break;
                                case 51:
                                    constraint.f22734f.f22847j = f;
                                    break;
                                case 52:
                                    constraint.f22734f.f22848k = f;
                                    break;
                                case 53:
                                    constraint.f22734f.f22849l = f;
                                    break;
                                default:
                                    switch (i5) {
                                        case 67:
                                            constraint.f22732d.f22826h = f;
                                            break;
                                        case 68:
                                            constraint.f22731c.f22836e = f;
                                            break;
                                        case 69:
                                            constraint.f22733e.f22785e0 = f;
                                            break;
                                        case 70:
                                            constraint.f22733e.f22787f0 = f;
                                            break;
                                        default:
                                            Log.w("ConstraintSet", "Unknown attribute 0x");
                                            break;
                                    }
                                    break;
                            }
                        } else {
                            constraint.f22733e.f22770U = f;
                        }
                    }
                }
                for (int i6 = 0; i6 < this.f22745i; i6++) {
                    int i7 = this.f22743g[i6];
                    String str = this.f22744h[i6];
                    int[] iArr3 = ConstraintSet.f22719h;
                    if (i7 == 5) {
                        constraint.f22733e.f22817z = str;
                    } else if (i7 == 65) {
                        constraint.f22732d.f22822d = str;
                    } else if (i7 == 74) {
                        Layout layout = constraint.f22733e;
                        layout.f22797k0 = str;
                        layout.f22795j0 = null;
                    } else if (i7 == 77) {
                        constraint.f22733e.f22799l0 = str;
                    } else if (i7 != 87) {
                        if (i7 != 90) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            constraint.f22732d.f22829k = str;
                        }
                    }
                }
                for (int i8 = 0; i8 < this.f22748l; i8++) {
                    int i9 = this.f22746j[i8];
                    boolean z2 = this.f22747k[i8];
                    int[] iArr4 = ConstraintSet.f22719h;
                    if (i9 == 44) {
                        constraint.f22734f.f22850m = z2;
                    } else if (i9 == 75) {
                        constraint.f22733e.f22805o0 = z2;
                    } else if (i9 != 87) {
                        if (i9 == 80) {
                            constraint.f22733e.f22801m0 = z2;
                        } else if (i9 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            constraint.f22733e.f22803n0 = z2;
                        }
                    }
                }
            }
        }

        public Constraint() {
            PropertySet propertySet = new PropertySet();
            propertySet.f22832a = false;
            propertySet.f22833b = 0;
            propertySet.f22834c = 0;
            propertySet.f22835d = 1.0f;
            propertySet.f22836e = Float.NaN;
            this.f22731c = propertySet;
            Motion motion = new Motion();
            motion.f22819a = false;
            motion.f22820b = -1;
            motion.f22821c = 0;
            motion.f22822d = null;
            motion.f22823e = -1;
            motion.f22824f = 0;
            motion.f22825g = Float.NaN;
            motion.f22826h = Float.NaN;
            motion.f22827i = Float.NaN;
            motion.f22828j = -1;
            motion.f22829k = null;
            motion.f22830l = -3;
            motion.f22831m = -1;
            this.f22732d = motion;
            Layout layout = new Layout();
            layout.f22776a = false;
            layout.f22778b = false;
            layout.f22784e = -1;
            layout.f22786f = -1;
            layout.f22788g = -1.0f;
            layout.f22790h = true;
            layout.f22792i = -1;
            layout.f22794j = -1;
            layout.f22796k = -1;
            layout.f22798l = -1;
            layout.f22800m = -1;
            layout.f22802n = -1;
            layout.f22804o = -1;
            layout.f22806p = -1;
            layout.f22808q = -1;
            layout.f22809r = -1;
            layout.f22810s = -1;
            layout.f22811t = -1;
            layout.f22812u = -1;
            layout.f22813v = -1;
            layout.f22814w = -1;
            layout.f22815x = 0.5f;
            layout.f22816y = 0.5f;
            layout.f22817z = null;
            layout.f22750A = -1;
            layout.f22751B = 0;
            layout.f22752C = 0.0f;
            layout.f22753D = -1;
            layout.f22754E = -1;
            layout.f22755F = -1;
            layout.f22756G = 0;
            layout.f22757H = 0;
            layout.f22758I = 0;
            layout.f22759J = 0;
            layout.f22760K = 0;
            layout.f22761L = 0;
            layout.f22762M = 0;
            layout.f22763N = Integer.MIN_VALUE;
            layout.f22764O = Integer.MIN_VALUE;
            layout.f22765P = Integer.MIN_VALUE;
            layout.f22766Q = Integer.MIN_VALUE;
            layout.f22767R = Integer.MIN_VALUE;
            layout.f22768S = Integer.MIN_VALUE;
            layout.f22769T = Integer.MIN_VALUE;
            layout.f22770U = -1.0f;
            layout.f22771V = -1.0f;
            layout.f22772W = 0;
            layout.f22773X = 0;
            layout.f22774Y = 0;
            layout.f22775Z = 0;
            layout.f22777a0 = 0;
            layout.f22779b0 = 0;
            layout.f22781c0 = 0;
            layout.f22783d0 = 0;
            layout.f22785e0 = 1.0f;
            layout.f22787f0 = 1.0f;
            layout.f22789g0 = -1;
            layout.f22791h0 = 0;
            layout.f22793i0 = -1;
            layout.f22801m0 = false;
            layout.f22803n0 = false;
            layout.f22805o0 = true;
            layout.f22807p0 = 0;
            this.f22733e = layout;
            Transform transform = new Transform();
            transform.f22838a = false;
            transform.f22839b = 0.0f;
            transform.f22840c = 0.0f;
            transform.f22841d = 0.0f;
            transform.f22842e = 1.0f;
            transform.f22843f = 1.0f;
            transform.f22844g = Float.NaN;
            transform.f22845h = Float.NaN;
            transform.f22846i = -1;
            transform.f22847j = 0.0f;
            transform.f22848k = 0.0f;
            transform.f22849l = 0.0f;
            transform.f22850m = false;
            transform.f22851n = 0.0f;
            this.f22734f = transform;
            this.f22735g = new HashMap();
        }

        /* JADX INFO: renamed from: a */
        public final void m7356a(Constraint constraint) {
            Delta delta = this.f22736h;
            if (delta != null) {
                delta.m7365e(constraint);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m7357b(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.f22733e;
            layoutParams.f22659e = layout.f22792i;
            layoutParams.f22661f = layout.f22794j;
            layoutParams.f22663g = layout.f22796k;
            layoutParams.f22665h = layout.f22798l;
            layoutParams.f22667i = layout.f22800m;
            layoutParams.f22669j = layout.f22802n;
            layoutParams.f22671k = layout.f22804o;
            layoutParams.f22673l = layout.f22806p;
            layoutParams.f22675m = layout.f22808q;
            layoutParams.f22677n = layout.f22809r;
            layoutParams.f22679o = layout.f22810s;
            layoutParams.f22686s = layout.f22811t;
            layoutParams.f22687t = layout.f22812u;
            layoutParams.f22688u = layout.f22813v;
            layoutParams.f22689v = layout.f22814w;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.f22756G;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.f22757H;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.f22758I;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.f22759J;
            layoutParams.f22625A = layout.f22768S;
            layoutParams.f22626B = layout.f22767R;
            layoutParams.f22691x = layout.f22764O;
            layoutParams.f22693z = layout.f22766Q;
            layoutParams.f22629E = layout.f22815x;
            layoutParams.f22630F = layout.f22816y;
            layoutParams.f22681p = layout.f22750A;
            layoutParams.f22683q = layout.f22751B;
            layoutParams.f22685r = layout.f22752C;
            layoutParams.f22631G = layout.f22817z;
            layoutParams.f22644T = layout.f22753D;
            layoutParams.f22645U = layout.f22754E;
            layoutParams.f22633I = layout.f22770U;
            layoutParams.f22632H = layout.f22771V;
            layoutParams.f22635K = layout.f22773X;
            layoutParams.f22634J = layout.f22772W;
            layoutParams.f22647W = layout.f22801m0;
            layoutParams.f22648X = layout.f22803n0;
            layoutParams.f22636L = layout.f22774Y;
            layoutParams.f22637M = layout.f22775Z;
            layoutParams.f22640P = layout.f22777a0;
            layoutParams.f22641Q = layout.f22779b0;
            layoutParams.f22638N = layout.f22781c0;
            layoutParams.f22639O = layout.f22783d0;
            layoutParams.f22642R = layout.f22785e0;
            layoutParams.f22643S = layout.f22787f0;
            layoutParams.f22646V = layout.f22755F;
            layoutParams.f22655c = layout.f22788g;
            layoutParams.f22651a = layout.f22784e;
            layoutParams.f22653b = layout.f22786f;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.f22780c;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.f22782d;
            String str = layout.f22799l0;
            if (str != null) {
                layoutParams.f22649Y = str;
            }
            layoutParams.f22650Z = layout.f22807p0;
            layoutParams.setMarginStart(layout.f22761L);
            layoutParams.setMarginEnd(layout.f22760K);
            layoutParams.m7334a();
        }

        /* JADX INFO: renamed from: c */
        public final Constraint m7358c() {
            Constraint constraint = new Constraint();
            constraint.f22733e.m7366a(this.f22733e);
            constraint.f22732d.m7368a(this.f22732d);
            PropertySet propertySet = constraint.f22731c;
            PropertySet propertySet2 = this.f22731c;
            propertySet.f22832a = propertySet2.f22832a;
            propertySet.f22833b = propertySet2.f22833b;
            propertySet.f22835d = propertySet2.f22835d;
            propertySet.f22836e = propertySet2.f22836e;
            propertySet.f22834c = propertySet2.f22834c;
            constraint.f22734f.m7371a(this.f22734f);
            constraint.f22729a = this.f22729a;
            constraint.f22736h = this.f22736h;
            return constraint;
        }

        public final /* bridge */ /* synthetic */ Object clone() {
            return m7358c();
        }

        /* JADX INFO: renamed from: d */
        public final void m7359d(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f22729a = i;
            int i2 = layoutParams.f22659e;
            Layout layout = this.f22733e;
            layout.f22792i = i2;
            layout.f22794j = layoutParams.f22661f;
            layout.f22796k = layoutParams.f22663g;
            layout.f22798l = layoutParams.f22665h;
            layout.f22800m = layoutParams.f22667i;
            layout.f22802n = layoutParams.f22669j;
            layout.f22804o = layoutParams.f22671k;
            layout.f22806p = layoutParams.f22673l;
            layout.f22808q = layoutParams.f22675m;
            layout.f22809r = layoutParams.f22677n;
            layout.f22810s = layoutParams.f22679o;
            layout.f22811t = layoutParams.f22686s;
            layout.f22812u = layoutParams.f22687t;
            layout.f22813v = layoutParams.f22688u;
            layout.f22814w = layoutParams.f22689v;
            layout.f22815x = layoutParams.f22629E;
            layout.f22816y = layoutParams.f22630F;
            layout.f22817z = layoutParams.f22631G;
            layout.f22750A = layoutParams.f22681p;
            layout.f22751B = layoutParams.f22683q;
            layout.f22752C = layoutParams.f22685r;
            layout.f22753D = layoutParams.f22644T;
            layout.f22754E = layoutParams.f22645U;
            layout.f22755F = layoutParams.f22646V;
            layout.f22788g = layoutParams.f22655c;
            layout.f22784e = layoutParams.f22651a;
            layout.f22786f = layoutParams.f22653b;
            layout.f22780c = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.f22782d = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.f22756G = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.f22757H = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.f22758I = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.f22759J = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.f22762M = layoutParams.f22628D;
            layout.f22770U = layoutParams.f22633I;
            layout.f22771V = layoutParams.f22632H;
            layout.f22773X = layoutParams.f22635K;
            layout.f22772W = layoutParams.f22634J;
            layout.f22801m0 = layoutParams.f22647W;
            layout.f22803n0 = layoutParams.f22648X;
            layout.f22774Y = layoutParams.f22636L;
            layout.f22775Z = layoutParams.f22637M;
            layout.f22777a0 = layoutParams.f22640P;
            layout.f22779b0 = layoutParams.f22641Q;
            layout.f22781c0 = layoutParams.f22638N;
            layout.f22783d0 = layoutParams.f22639O;
            layout.f22785e0 = layoutParams.f22642R;
            layout.f22787f0 = layoutParams.f22643S;
            layout.f22799l0 = layoutParams.f22649Y;
            layout.f22764O = layoutParams.f22691x;
            layout.f22766Q = layoutParams.f22693z;
            layout.f22763N = layoutParams.f22690w;
            layout.f22765P = layoutParams.f22692y;
            layout.f22768S = layoutParams.f22625A;
            layout.f22767R = layoutParams.f22626B;
            layout.f22769T = layoutParams.f22627C;
            layout.f22807p0 = layoutParams.f22650Z;
            layout.f22760K = layoutParams.getMarginEnd();
            layout.f22761L = layoutParams.getMarginStart();
        }

        /* JADX INFO: renamed from: e */
        public final void m7360e(int i, Constraints.LayoutParams layoutParams) {
            m7359d(i, layoutParams);
            this.f22731c.f22835d = layoutParams.f22856r0;
            float f = layoutParams.f22859u0;
            Transform transform = this.f22734f;
            transform.f22839b = f;
            transform.f22840c = layoutParams.f22860v0;
            transform.f22841d = layoutParams.f22861w0;
            transform.f22842e = layoutParams.f22862x0;
            transform.f22843f = layoutParams.f22863y0;
            transform.f22844g = layoutParams.f22864z0;
            transform.f22845h = layoutParams.f22852A0;
            transform.f22847j = layoutParams.f22853B0;
            transform.f22848k = layoutParams.f22854C0;
            transform.f22849l = layoutParams.f22855D0;
            transform.f22851n = layoutParams.f22858t0;
            transform.f22850m = layoutParams.f22857s0;
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Layout {

        /* JADX INFO: renamed from: q0 */
        public static final SparseIntArray f22749q0;

        /* JADX INFO: renamed from: A */
        public int f22750A;

        /* JADX INFO: renamed from: B */
        public int f22751B;

        /* JADX INFO: renamed from: C */
        public float f22752C;

        /* JADX INFO: renamed from: D */
        public int f22753D;

        /* JADX INFO: renamed from: E */
        public int f22754E;

        /* JADX INFO: renamed from: F */
        public int f22755F;

        /* JADX INFO: renamed from: G */
        public int f22756G;

        /* JADX INFO: renamed from: H */
        public int f22757H;

        /* JADX INFO: renamed from: I */
        public int f22758I;

        /* JADX INFO: renamed from: J */
        public int f22759J;

        /* JADX INFO: renamed from: K */
        public int f22760K;

        /* JADX INFO: renamed from: L */
        public int f22761L;

        /* JADX INFO: renamed from: M */
        public int f22762M;

        /* JADX INFO: renamed from: N */
        public int f22763N;

        /* JADX INFO: renamed from: O */
        public int f22764O;

        /* JADX INFO: renamed from: P */
        public int f22765P;

        /* JADX INFO: renamed from: Q */
        public int f22766Q;

        /* JADX INFO: renamed from: R */
        public int f22767R;

        /* JADX INFO: renamed from: S */
        public int f22768S;

        /* JADX INFO: renamed from: T */
        public int f22769T;

        /* JADX INFO: renamed from: U */
        public float f22770U;

        /* JADX INFO: renamed from: V */
        public float f22771V;

        /* JADX INFO: renamed from: W */
        public int f22772W;

        /* JADX INFO: renamed from: X */
        public int f22773X;

        /* JADX INFO: renamed from: Y */
        public int f22774Y;

        /* JADX INFO: renamed from: Z */
        public int f22775Z;

        /* JADX INFO: renamed from: a */
        public boolean f22776a;

        /* JADX INFO: renamed from: a0 */
        public int f22777a0;

        /* JADX INFO: renamed from: b */
        public boolean f22778b;

        /* JADX INFO: renamed from: b0 */
        public int f22779b0;

        /* JADX INFO: renamed from: c */
        public int f22780c;

        /* JADX INFO: renamed from: c0 */
        public int f22781c0;

        /* JADX INFO: renamed from: d */
        public int f22782d;

        /* JADX INFO: renamed from: d0 */
        public int f22783d0;

        /* JADX INFO: renamed from: e */
        public int f22784e;

        /* JADX INFO: renamed from: e0 */
        public float f22785e0;

        /* JADX INFO: renamed from: f */
        public int f22786f;

        /* JADX INFO: renamed from: f0 */
        public float f22787f0;

        /* JADX INFO: renamed from: g */
        public float f22788g;

        /* JADX INFO: renamed from: g0 */
        public int f22789g0;

        /* JADX INFO: renamed from: h */
        public boolean f22790h;

        /* JADX INFO: renamed from: h0 */
        public int f22791h0;

        /* JADX INFO: renamed from: i */
        public int f22792i;

        /* JADX INFO: renamed from: i0 */
        public int f22793i0;

        /* JADX INFO: renamed from: j */
        public int f22794j;

        /* JADX INFO: renamed from: j0 */
        public int[] f22795j0;

        /* JADX INFO: renamed from: k */
        public int f22796k;

        /* JADX INFO: renamed from: k0 */
        public String f22797k0;

        /* JADX INFO: renamed from: l */
        public int f22798l;

        /* JADX INFO: renamed from: l0 */
        public String f22799l0;

        /* JADX INFO: renamed from: m */
        public int f22800m;

        /* JADX INFO: renamed from: m0 */
        public boolean f22801m0;

        /* JADX INFO: renamed from: n */
        public int f22802n;

        /* JADX INFO: renamed from: n0 */
        public boolean f22803n0;

        /* JADX INFO: renamed from: o */
        public int f22804o;

        /* JADX INFO: renamed from: o0 */
        public boolean f22805o0;

        /* JADX INFO: renamed from: p */
        public int f22806p;

        /* JADX INFO: renamed from: p0 */
        public int f22807p0;

        /* JADX INFO: renamed from: q */
        public int f22808q;

        /* JADX INFO: renamed from: r */
        public int f22809r;

        /* JADX INFO: renamed from: s */
        public int f22810s;

        /* JADX INFO: renamed from: t */
        public int f22811t;

        /* JADX INFO: renamed from: u */
        public int f22812u;

        /* JADX INFO: renamed from: v */
        public int f22813v;

        /* JADX INFO: renamed from: w */
        public int f22814w;

        /* JADX INFO: renamed from: x */
        public float f22815x;

        /* JADX INFO: renamed from: y */
        public float f22816y;

        /* JADX INFO: renamed from: z */
        public String f22817z;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22749q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 87);
            sparseIntArray.append(16, 88);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
            sparseIntArray.append(58, 84);
            sparseIntArray.append(59, 86);
            sparseIntArray.append(58, 83);
            sparseIntArray.append(37, 85);
            sparseIntArray.append(56, 87);
            sparseIntArray.append(34, 88);
            sparseIntArray.append(91, 89);
            sparseIntArray.append(15, 90);
        }

        /* JADX INFO: renamed from: a */
        public final void m7366a(Layout layout) {
            this.f22776a = layout.f22776a;
            this.f22780c = layout.f22780c;
            this.f22778b = layout.f22778b;
            this.f22782d = layout.f22782d;
            this.f22784e = layout.f22784e;
            this.f22786f = layout.f22786f;
            this.f22788g = layout.f22788g;
            this.f22790h = layout.f22790h;
            this.f22792i = layout.f22792i;
            this.f22794j = layout.f22794j;
            this.f22796k = layout.f22796k;
            this.f22798l = layout.f22798l;
            this.f22800m = layout.f22800m;
            this.f22802n = layout.f22802n;
            this.f22804o = layout.f22804o;
            this.f22806p = layout.f22806p;
            this.f22808q = layout.f22808q;
            this.f22809r = layout.f22809r;
            this.f22810s = layout.f22810s;
            this.f22811t = layout.f22811t;
            this.f22812u = layout.f22812u;
            this.f22813v = layout.f22813v;
            this.f22814w = layout.f22814w;
            this.f22815x = layout.f22815x;
            this.f22816y = layout.f22816y;
            this.f22817z = layout.f22817z;
            this.f22750A = layout.f22750A;
            this.f22751B = layout.f22751B;
            this.f22752C = layout.f22752C;
            this.f22753D = layout.f22753D;
            this.f22754E = layout.f22754E;
            this.f22755F = layout.f22755F;
            this.f22756G = layout.f22756G;
            this.f22757H = layout.f22757H;
            this.f22758I = layout.f22758I;
            this.f22759J = layout.f22759J;
            this.f22760K = layout.f22760K;
            this.f22761L = layout.f22761L;
            this.f22762M = layout.f22762M;
            this.f22763N = layout.f22763N;
            this.f22764O = layout.f22764O;
            this.f22765P = layout.f22765P;
            this.f22766Q = layout.f22766Q;
            this.f22767R = layout.f22767R;
            this.f22768S = layout.f22768S;
            this.f22769T = layout.f22769T;
            this.f22770U = layout.f22770U;
            this.f22771V = layout.f22771V;
            this.f22772W = layout.f22772W;
            this.f22773X = layout.f22773X;
            this.f22774Y = layout.f22774Y;
            this.f22775Z = layout.f22775Z;
            this.f22777a0 = layout.f22777a0;
            this.f22779b0 = layout.f22779b0;
            this.f22781c0 = layout.f22781c0;
            this.f22783d0 = layout.f22783d0;
            this.f22785e0 = layout.f22785e0;
            this.f22787f0 = layout.f22787f0;
            this.f22789g0 = layout.f22789g0;
            this.f22791h0 = layout.f22791h0;
            this.f22793i0 = layout.f22793i0;
            this.f22799l0 = layout.f22799l0;
            int[] iArr = layout.f22795j0;
            if (iArr == null || layout.f22797k0 != null) {
                this.f22795j0 = null;
            } else {
                this.f22795j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f22797k0 = layout.f22797k0;
            this.f22801m0 = layout.f22801m0;
            this.f22803n0 = layout.f22803n0;
            this.f22805o0 = layout.f22805o0;
            this.f22807p0 = layout.f22807p0;
        }

        /* JADX INFO: renamed from: b */
        public final void m7367b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f22879k);
            this.f22778b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = f22749q0;
                int i2 = sparseIntArray.get(index);
                switch (i2) {
                    case 1:
                        this.f22808q = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22808q);
                        break;
                    case 2:
                        this.f22759J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22759J);
                        break;
                    case 3:
                        this.f22806p = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22806p);
                        break;
                    case 4:
                        this.f22804o = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22804o);
                        break;
                    case 5:
                        this.f22817z = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f22753D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22753D);
                        break;
                    case 7:
                        this.f22754E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22754E);
                        break;
                    case 8:
                        this.f22760K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22760K);
                        break;
                    case 9:
                        this.f22814w = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22814w);
                        break;
                    case 10:
                        this.f22813v = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22813v);
                        break;
                    case 11:
                        this.f22766Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22766Q);
                        break;
                    case TYPE_BYTES_VALUE:
                        this.f22767R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22767R);
                        break;
                    case 13:
                        this.f22763N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22763N);
                        break;
                    case 14:
                        this.f22765P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22765P);
                        break;
                    case 15:
                        this.f22768S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22768S);
                        break;
                    case 16:
                        this.f22764O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22764O);
                        break;
                    case 17:
                        this.f22784e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22784e);
                        break;
                    case 18:
                        this.f22786f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22786f);
                        break;
                    case 19:
                        this.f22788g = typedArrayObtainStyledAttributes.getFloat(index, this.f22788g);
                        break;
                    case 20:
                        this.f22815x = typedArrayObtainStyledAttributes.getFloat(index, this.f22815x);
                        break;
                    case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        this.f22782d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f22782d);
                        break;
                    case 22:
                        this.f22780c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f22780c);
                        break;
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.f22756G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22756G);
                        break;
                    case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                        this.f22792i = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22792i);
                        break;
                    case BuildConfig.VERSION_CODE /* 25 */:
                        this.f22794j = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22794j);
                        break;
                    case 26:
                        this.f22755F = typedArrayObtainStyledAttributes.getInt(index, this.f22755F);
                        break;
                    case 27:
                        this.f22757H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22757H);
                        break;
                    case 28:
                        this.f22796k = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22796k);
                        break;
                    case 29:
                        this.f22798l = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22798l);
                        break;
                    case 30:
                        this.f22761L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22761L);
                        break;
                    case 31:
                        this.f22811t = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22811t);
                        break;
                    case 32:
                        this.f22812u = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22812u);
                        break;
                    case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                        this.f22758I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22758I);
                        break;
                    case 34:
                        this.f22802n = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22802n);
                        break;
                    case 35:
                        this.f22800m = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22800m);
                        break;
                    case 36:
                        this.f22816y = typedArrayObtainStyledAttributes.getFloat(index, this.f22816y);
                        break;
                    case 37:
                        this.f22771V = typedArrayObtainStyledAttributes.getFloat(index, this.f22771V);
                        break;
                    case 38:
                        this.f22770U = typedArrayObtainStyledAttributes.getFloat(index, this.f22770U);
                        break;
                    case 39:
                        this.f22772W = typedArrayObtainStyledAttributes.getInt(index, this.f22772W);
                        break;
                    case 40:
                        this.f22773X = typedArrayObtainStyledAttributes.getInt(index, this.f22773X);
                        break;
                    case me.jessyan.autosize.BuildConfig.VERSION_CODE /* 41 */:
                        ConstraintSet.m7344n(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ConstraintSet.m7344n(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f22750A = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22750A);
                                break;
                            case 62:
                                this.f22751B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22751B);
                                break;
                            case 63:
                                this.f22752C = typedArrayObtainStyledAttributes.getFloat(index, this.f22752C);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f22785e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f22787f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f22789g0 = typedArrayObtainStyledAttributes.getInt(index, this.f22789g0);
                                        break;
                                    case 73:
                                        this.f22791h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22791h0);
                                        break;
                                    case 74:
                                        this.f22797k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f22805o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f22805o0);
                                        break;
                                    case 76:
                                        this.f22807p0 = typedArrayObtainStyledAttributes.getInt(index, this.f22807p0);
                                        break;
                                    case 77:
                                        this.f22809r = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22809r);
                                        break;
                                    case 78:
                                        this.f22810s = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22810s);
                                        break;
                                    case 79:
                                        this.f22769T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22769T);
                                        break;
                                    case 80:
                                        this.f22762M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22762M);
                                        break;
                                    case 81:
                                        this.f22774Y = typedArrayObtainStyledAttributes.getInt(index, this.f22774Y);
                                        break;
                                    case 82:
                                        this.f22775Z = typedArrayObtainStyledAttributes.getInt(index, this.f22775Z);
                                        break;
                                    case 83:
                                        this.f22779b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22779b0);
                                        break;
                                    case 84:
                                        this.f22777a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22777a0);
                                        break;
                                    case SurveyViewModel.ENTITY_TYPE /* 85 */:
                                        this.f22783d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22783d0);
                                        break;
                                    case 86:
                                        this.f22781c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22781c0);
                                        break;
                                    case 87:
                                        this.f22801m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f22801m0);
                                        break;
                                    case 88:
                                        this.f22803n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f22803n0);
                                        break;
                                    case 89:
                                        this.f22799l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                                        this.f22790h = typedArrayObtainStyledAttributes.getBoolean(index, this.f22790h);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Motion {

        /* JADX INFO: renamed from: n */
        public static final SparseIntArray f22818n;

        /* JADX INFO: renamed from: a */
        public boolean f22819a;

        /* JADX INFO: renamed from: b */
        public int f22820b;

        /* JADX INFO: renamed from: c */
        public int f22821c;

        /* JADX INFO: renamed from: d */
        public String f22822d;

        /* JADX INFO: renamed from: e */
        public int f22823e;

        /* JADX INFO: renamed from: f */
        public int f22824f;

        /* JADX INFO: renamed from: g */
        public float f22825g;

        /* JADX INFO: renamed from: h */
        public float f22826h;

        /* JADX INFO: renamed from: i */
        public float f22827i;

        /* JADX INFO: renamed from: j */
        public int f22828j;

        /* JADX INFO: renamed from: k */
        public String f22829k;

        /* JADX INFO: renamed from: l */
        public int f22830l;

        /* JADX INFO: renamed from: m */
        public int f22831m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22818n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        /* JADX INFO: renamed from: a */
        public final void m7368a(Motion motion) {
            this.f22819a = motion.f22819a;
            this.f22820b = motion.f22820b;
            this.f22822d = motion.f22822d;
            this.f22823e = motion.f22823e;
            this.f22824f = motion.f22824f;
            this.f22826h = motion.f22826h;
            this.f22825g = motion.f22825g;
        }

        /* JADX INFO: renamed from: b */
        public final void m7369b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f22880l);
            this.f22819a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f22818n.get(index)) {
                    case 1:
                        this.f22826h = typedArrayObtainStyledAttributes.getFloat(index, this.f22826h);
                        break;
                    case 2:
                        this.f22823e = typedArrayObtainStyledAttributes.getInt(index, this.f22823e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f22822d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f22822d = Easing.f21420c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f22824f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f22820b = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22820b);
                        break;
                    case 6:
                        this.f22821c = typedArrayObtainStyledAttributes.getInteger(index, this.f22821c);
                        break;
                    case 7:
                        this.f22825g = typedArrayObtainStyledAttributes.getFloat(index, this.f22825g);
                        break;
                    case 8:
                        this.f22828j = typedArrayObtainStyledAttributes.getInteger(index, this.f22828j);
                        break;
                    case 9:
                        this.f22827i = typedArrayObtainStyledAttributes.getFloat(index, this.f22827i);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f22831m = resourceId;
                            if (resourceId != -1) {
                                this.f22830l = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f22829k = string;
                            if (string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                                this.f22831m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f22830l = -2;
                            } else {
                                this.f22830l = -1;
                            }
                        } else {
                            this.f22830l = typedArrayObtainStyledAttributes.getInteger(index, this.f22831m);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class PropertySet {

        /* JADX INFO: renamed from: a */
        public boolean f22832a;

        /* JADX INFO: renamed from: b */
        public int f22833b;

        /* JADX INFO: renamed from: c */
        public int f22834c;

        /* JADX INFO: renamed from: d */
        public float f22835d;

        /* JADX INFO: renamed from: e */
        public float f22836e;

        /* JADX INFO: renamed from: a */
        public final void m7370a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f22885q);
            this.f22832a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.f22835d = typedArrayObtainStyledAttributes.getFloat(index, this.f22835d);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f22833b);
                    this.f22833b = i2;
                    this.f22833b = ConstraintSet.f22719h[i2];
                } else if (index == 4) {
                    this.f22834c = typedArrayObtainStyledAttributes.getInt(index, this.f22834c);
                } else if (index == 3) {
                    this.f22836e = typedArrayObtainStyledAttributes.getFloat(index, this.f22836e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public static class Transform {

        /* JADX INFO: renamed from: o */
        public static final SparseIntArray f22837o;

        /* JADX INFO: renamed from: a */
        public boolean f22838a;

        /* JADX INFO: renamed from: b */
        public float f22839b;

        /* JADX INFO: renamed from: c */
        public float f22840c;

        /* JADX INFO: renamed from: d */
        public float f22841d;

        /* JADX INFO: renamed from: e */
        public float f22842e;

        /* JADX INFO: renamed from: f */
        public float f22843f;

        /* JADX INFO: renamed from: g */
        public float f22844g;

        /* JADX INFO: renamed from: h */
        public float f22845h;

        /* JADX INFO: renamed from: i */
        public int f22846i;

        /* JADX INFO: renamed from: j */
        public float f22847j;

        /* JADX INFO: renamed from: k */
        public float f22848k;

        /* JADX INFO: renamed from: l */
        public float f22849l;

        /* JADX INFO: renamed from: m */
        public boolean f22850m;

        /* JADX INFO: renamed from: n */
        public float f22851n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22837o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        /* JADX INFO: renamed from: a */
        public final void m7371a(Transform transform) {
            this.f22838a = transform.f22838a;
            this.f22839b = transform.f22839b;
            this.f22840c = transform.f22840c;
            this.f22841d = transform.f22841d;
            this.f22842e = transform.f22842e;
            this.f22843f = transform.f22843f;
            this.f22844g = transform.f22844g;
            this.f22845h = transform.f22845h;
            this.f22846i = transform.f22846i;
            this.f22847j = transform.f22847j;
            this.f22848k = transform.f22848k;
            this.f22849l = transform.f22849l;
            this.f22850m = transform.f22850m;
            this.f22851n = transform.f22851n;
        }

        /* JADX INFO: renamed from: b */
        public final void m7372b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f22888t);
            this.f22838a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f22837o.get(index)) {
                    case 1:
                        this.f22839b = typedArrayObtainStyledAttributes.getFloat(index, this.f22839b);
                        break;
                    case 2:
                        this.f22840c = typedArrayObtainStyledAttributes.getFloat(index, this.f22840c);
                        break;
                    case 3:
                        this.f22841d = typedArrayObtainStyledAttributes.getFloat(index, this.f22841d);
                        break;
                    case 4:
                        this.f22842e = typedArrayObtainStyledAttributes.getFloat(index, this.f22842e);
                        break;
                    case 5:
                        this.f22843f = typedArrayObtainStyledAttributes.getFloat(index, this.f22843f);
                        break;
                    case 6:
                        this.f22844g = typedArrayObtainStyledAttributes.getDimension(index, this.f22844g);
                        break;
                    case 7:
                        this.f22845h = typedArrayObtainStyledAttributes.getDimension(index, this.f22845h);
                        break;
                    case 8:
                        this.f22847j = typedArrayObtainStyledAttributes.getDimension(index, this.f22847j);
                        break;
                    case 9:
                        this.f22848k = typedArrayObtainStyledAttributes.getDimension(index, this.f22848k);
                        break;
                    case 10:
                        this.f22849l = typedArrayObtainStyledAttributes.getDimension(index, this.f22849l);
                        break;
                    case 11:
                        this.f22850m = true;
                        this.f22851n = typedArrayObtainStyledAttributes.getDimension(index, this.f22851n);
                        break;
                    case TYPE_BYTES_VALUE:
                        this.f22846i = ConstraintSet.m7343m(typedArrayObtainStyledAttributes, index, this.f22846i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: Proguard */
    public class WriteJsonEngine {
    }

    /* JADX INFO: compiled from: Proguard */
    public class WriteXmlEngine {
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22720i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f22721j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(MTObservable.WHAT_OBSERVER, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(ModuleDescriptor.MODULE_VERSION, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(MTObservable.WHAT_OBSERVER, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX INFO: renamed from: e */
    public static Constraint m7340e(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, R.styleable.f22871c);
        m7346p(constraint, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m7341g(Barrier barrier, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: h */
    public static Constraint m7342h(Context context, AttributeSet attributeSet, boolean z2) {
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2 ? R.styleable.f22871c : R.styleable.f22869a);
        if (z2) {
            m7346p(constraint, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i = 0;
            while (true) {
                Layout layout = constraint.f22733e;
                if (i < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    PropertySet propertySet = constraint.f22731c;
                    Transform transform = constraint.f22734f;
                    Motion motion = constraint.f22732d;
                    if (index != 1 && 23 != index && 24 != index) {
                        motion.f22819a = true;
                        layout.f22778b = true;
                        propertySet.f22832a = true;
                        transform.f22838a = true;
                    }
                    SparseIntArray sparseIntArray = f22720i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            layout.f22808q = m7343m(typedArrayObtainStyledAttributes, index, layout.f22808q);
                            break;
                        case 2:
                            layout.f22759J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22759J);
                            break;
                        case 3:
                            layout.f22806p = m7343m(typedArrayObtainStyledAttributes, index, layout.f22806p);
                            break;
                        case 4:
                            layout.f22804o = m7343m(typedArrayObtainStyledAttributes, index, layout.f22804o);
                            break;
                        case 5:
                            layout.f22817z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            layout.f22753D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.f22753D);
                            break;
                        case 7:
                            layout.f22754E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.f22754E);
                            break;
                        case 8:
                            layout.f22760K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22760K);
                            break;
                        case 9:
                            layout.f22814w = m7343m(typedArrayObtainStyledAttributes, index, layout.f22814w);
                            break;
                        case 10:
                            layout.f22813v = m7343m(typedArrayObtainStyledAttributes, index, layout.f22813v);
                            break;
                        case 11:
                            layout.f22766Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22766Q);
                            break;
                        case TYPE_BYTES_VALUE:
                            layout.f22767R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22767R);
                            break;
                        case 13:
                            layout.f22763N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22763N);
                            break;
                        case 14:
                            layout.f22765P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22765P);
                            break;
                        case 15:
                            layout.f22768S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22768S);
                            break;
                        case 16:
                            layout.f22764O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22764O);
                            break;
                        case 17:
                            layout.f22784e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.f22784e);
                            break;
                        case 18:
                            layout.f22786f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, layout.f22786f);
                            break;
                        case 19:
                            layout.f22788g = typedArrayObtainStyledAttributes.getFloat(index, layout.f22788g);
                            break;
                        case 20:
                            layout.f22815x = typedArrayObtainStyledAttributes.getFloat(index, layout.f22815x);
                            break;
                        case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            layout.f22782d = typedArrayObtainStyledAttributes.getLayoutDimension(index, layout.f22782d);
                            break;
                        case 22:
                            int i2 = typedArrayObtainStyledAttributes.getInt(index, propertySet.f22833b);
                            propertySet.f22833b = i2;
                            propertySet.f22833b = f22719h[i2];
                            break;
                        case ConnectionResult.API_DISABLED /* 23 */:
                            layout.f22780c = typedArrayObtainStyledAttributes.getLayoutDimension(index, layout.f22780c);
                            break;
                        case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                            layout.f22756G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22756G);
                            break;
                        case BuildConfig.VERSION_CODE /* 25 */:
                            layout.f22792i = m7343m(typedArrayObtainStyledAttributes, index, layout.f22792i);
                            break;
                        case 26:
                            layout.f22794j = m7343m(typedArrayObtainStyledAttributes, index, layout.f22794j);
                            break;
                        case 27:
                            layout.f22755F = typedArrayObtainStyledAttributes.getInt(index, layout.f22755F);
                            break;
                        case 28:
                            layout.f22757H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22757H);
                            break;
                        case 29:
                            layout.f22796k = m7343m(typedArrayObtainStyledAttributes, index, layout.f22796k);
                            break;
                        case 30:
                            layout.f22798l = m7343m(typedArrayObtainStyledAttributes, index, layout.f22798l);
                            break;
                        case 31:
                            layout.f22761L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22761L);
                            break;
                        case 32:
                            layout.f22811t = m7343m(typedArrayObtainStyledAttributes, index, layout.f22811t);
                            break;
                        case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            layout.f22812u = m7343m(typedArrayObtainStyledAttributes, index, layout.f22812u);
                            break;
                        case 34:
                            layout.f22758I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22758I);
                            break;
                        case 35:
                            layout.f22802n = m7343m(typedArrayObtainStyledAttributes, index, layout.f22802n);
                            break;
                        case 36:
                            layout.f22800m = m7343m(typedArrayObtainStyledAttributes, index, layout.f22800m);
                            break;
                        case 37:
                            layout.f22816y = typedArrayObtainStyledAttributes.getFloat(index, layout.f22816y);
                            break;
                        case 38:
                            constraint.f22729a = typedArrayObtainStyledAttributes.getResourceId(index, constraint.f22729a);
                            break;
                        case 39:
                            layout.f22771V = typedArrayObtainStyledAttributes.getFloat(index, layout.f22771V);
                            break;
                        case 40:
                            layout.f22770U = typedArrayObtainStyledAttributes.getFloat(index, layout.f22770U);
                            break;
                        case me.jessyan.autosize.BuildConfig.VERSION_CODE /* 41 */:
                            layout.f22772W = typedArrayObtainStyledAttributes.getInt(index, layout.f22772W);
                            break;
                        case 42:
                            layout.f22773X = typedArrayObtainStyledAttributes.getInt(index, layout.f22773X);
                            break;
                        case 43:
                            propertySet.f22835d = typedArrayObtainStyledAttributes.getFloat(index, propertySet.f22835d);
                            break;
                        case Carousel.ENTITY_TYPE /* 44 */:
                            transform.f22850m = true;
                            transform.f22851n = typedArrayObtainStyledAttributes.getDimension(index, transform.f22851n);
                            break;
                        case 45:
                            transform.f22840c = typedArrayObtainStyledAttributes.getFloat(index, transform.f22840c);
                            break;
                        case 46:
                            transform.f22841d = typedArrayObtainStyledAttributes.getFloat(index, transform.f22841d);
                            break;
                        case 47:
                            transform.f22842e = typedArrayObtainStyledAttributes.getFloat(index, transform.f22842e);
                            break;
                        case 48:
                            transform.f22843f = typedArrayObtainStyledAttributes.getFloat(index, transform.f22843f);
                            break;
                        case 49:
                            transform.f22844g = typedArrayObtainStyledAttributes.getDimension(index, transform.f22844g);
                            break;
                        case 50:
                            transform.f22845h = typedArrayObtainStyledAttributes.getDimension(index, transform.f22845h);
                            break;
                        case 51:
                            transform.f22847j = typedArrayObtainStyledAttributes.getDimension(index, transform.f22847j);
                            break;
                        case 52:
                            transform.f22848k = typedArrayObtainStyledAttributes.getDimension(index, transform.f22848k);
                            break;
                        case 53:
                            transform.f22849l = typedArrayObtainStyledAttributes.getDimension(index, transform.f22849l);
                            break;
                        case 54:
                            layout.f22774Y = typedArrayObtainStyledAttributes.getInt(index, layout.f22774Y);
                            break;
                        case 55:
                            layout.f22775Z = typedArrayObtainStyledAttributes.getInt(index, layout.f22775Z);
                            break;
                        case 56:
                            layout.f22777a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22777a0);
                            break;
                        case 57:
                            layout.f22779b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22779b0);
                            break;
                        case 58:
                            layout.f22781c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22781c0);
                            break;
                        case 59:
                            layout.f22783d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22783d0);
                            break;
                        case 60:
                            transform.f22839b = typedArrayObtainStyledAttributes.getFloat(index, transform.f22839b);
                            break;
                        case 61:
                            layout.f22750A = m7343m(typedArrayObtainStyledAttributes, index, layout.f22750A);
                            break;
                        case 62:
                            layout.f22751B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22751B);
                            break;
                        case 63:
                            layout.f22752C = typedArrayObtainStyledAttributes.getFloat(index, layout.f22752C);
                            break;
                        case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                            motion.f22820b = m7343m(typedArrayObtainStyledAttributes, index, motion.f22820b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                motion.f22822d = Easing.f21420c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                motion.f22822d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            motion.f22824f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            motion.f22826h = typedArrayObtainStyledAttributes.getFloat(index, motion.f22826h);
                            break;
                        case 68:
                            propertySet.f22836e = typedArrayObtainStyledAttributes.getFloat(index, propertySet.f22836e);
                            break;
                        case 69:
                            layout.f22785e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            layout.f22787f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            layout.f22789g0 = typedArrayObtainStyledAttributes.getInt(index, layout.f22789g0);
                            break;
                        case 73:
                            layout.f22791h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22791h0);
                            break;
                        case 74:
                            layout.f22797k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            layout.f22805o0 = typedArrayObtainStyledAttributes.getBoolean(index, layout.f22805o0);
                            break;
                        case 76:
                            motion.f22823e = typedArrayObtainStyledAttributes.getInt(index, motion.f22823e);
                            break;
                        case 77:
                            layout.f22799l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            propertySet.f22834c = typedArrayObtainStyledAttributes.getInt(index, propertySet.f22834c);
                            break;
                        case 79:
                            motion.f22825g = typedArrayObtainStyledAttributes.getFloat(index, motion.f22825g);
                            break;
                        case 80:
                            layout.f22801m0 = typedArrayObtainStyledAttributes.getBoolean(index, layout.f22801m0);
                            break;
                        case 81:
                            layout.f22803n0 = typedArrayObtainStyledAttributes.getBoolean(index, layout.f22803n0);
                            break;
                        case 82:
                            motion.f22821c = typedArrayObtainStyledAttributes.getInteger(index, motion.f22821c);
                            break;
                        case 83:
                            transform.f22846i = m7343m(typedArrayObtainStyledAttributes, index, transform.f22846i);
                            break;
                        case 84:
                            motion.f22828j = typedArrayObtainStyledAttributes.getInteger(index, motion.f22828j);
                            break;
                        case SurveyViewModel.ENTITY_TYPE /* 85 */:
                            motion.f22827i = typedArrayObtainStyledAttributes.getFloat(index, motion.f22827i);
                            break;
                        case 86:
                            int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i3 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                motion.f22831m = resourceId;
                                if (resourceId != -1) {
                                    motion.f22830l = -2;
                                }
                            } else if (i3 != 3) {
                                motion.f22830l = typedArrayObtainStyledAttributes.getInteger(index, motion.f22831m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                motion.f22829k = string;
                                if (string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) <= 0) {
                                    motion.f22830l = -1;
                                } else {
                                    motion.f22831m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    motion.f22830l = -2;
                                }
                            }
                            break;
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            layout.f22809r = m7343m(typedArrayObtainStyledAttributes, index, layout.f22809r);
                            break;
                        case 92:
                            layout.f22810s = m7343m(typedArrayObtainStyledAttributes, index, layout.f22810s);
                            break;
                        case 93:
                            layout.f22762M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22762M);
                            break;
                        case 94:
                            layout.f22769T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, layout.f22769T);
                            break;
                        case 95:
                            m7344n(layout, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            m7344n(layout, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            layout.f22807p0 = typedArrayObtainStyledAttributes.getInt(index, layout.f22807p0);
                            break;
                    }
                    i++;
                } else if (layout.f22797k0 != null) {
                    layout.f22795j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    /* JADX INFO: renamed from: m */
    public static int m7343m(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7344n(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z2 = true;
        int i4 = 0;
        if (i3 == 3) {
            String string = typedArray.getString(i);
            if (string == null) {
                return;
            }
            int iIndexOf = string.indexOf(61);
            int length = string.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                return;
            }
            String strSubstring = string.substring(0, iIndexOf);
            String strSubstring2 = string.substring(iIndexOf + 1);
            if (strSubstring2.length() > 0) {
                String strTrim = strSubstring.trim();
                String strTrim2 = strSubstring2.trim();
                if ("ratio".equalsIgnoreCase(strTrim)) {
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                        }
                        m7345o(layoutParams, strTrim2);
                        return;
                    }
                    if (obj instanceof Layout) {
                        ((Layout) obj).f22817z = strTrim2;
                        return;
                    } else {
                        if (obj instanceof Constraint.Delta) {
                            ((Constraint.Delta) obj).m7363c(5, strTrim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if ("weight".equalsIgnoreCase(strTrim)) {
                        float f = Float.parseFloat(strTrim2);
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                                layoutParams2.f22632H = f;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                                layoutParams2.f22633I = f;
                                return;
                            }
                        }
                        if (obj instanceof Layout) {
                            Layout layout = (Layout) obj;
                            if (i2 == 0) {
                                layout.f22780c = 0;
                                layout.f22771V = f;
                                return;
                            } else {
                                layout.f22782d = 0;
                                layout.f22770U = f;
                                return;
                            }
                        }
                        if (obj instanceof Constraint.Delta) {
                            Constraint.Delta delta = (Constraint.Delta) obj;
                            if (i2 == 0) {
                                delta.m7362b(23, 0);
                                delta.m7361a(f, 39);
                                return;
                            } else {
                                delta.m7362b(21, 0);
                                delta.m7361a(f, 40);
                                return;
                            }
                        }
                        return;
                    }
                    if ("parent".equalsIgnoreCase(strTrim)) {
                        float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                            if (i2 == 0) {
                                ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                                layoutParams3.f22642R = fMax;
                                layoutParams3.f22636L = 2;
                                return;
                            } else {
                                ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                                layoutParams3.f22643S = fMax;
                                layoutParams3.f22637M = 2;
                                return;
                            }
                        }
                        if (obj instanceof Layout) {
                            Layout layout2 = (Layout) obj;
                            if (i2 == 0) {
                                layout2.f22780c = 0;
                                layout2.f22785e0 = fMax;
                                layout2.f22774Y = 2;
                                return;
                            } else {
                                layout2.f22782d = 0;
                                layout2.f22787f0 = fMax;
                                layout2.f22775Z = 2;
                                return;
                            }
                        }
                        if (obj instanceof Constraint.Delta) {
                            Constraint.Delta delta2 = (Constraint.Delta) obj;
                            if (i2 == 0) {
                                delta2.m7362b(23, 0);
                                delta2.m7362b(54, 2);
                                return;
                            } else {
                                delta2.m7362b(21, 0);
                                delta2.m7362b(55, 2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            }
            return;
        }
        if (i3 != 5) {
            dimensionPixelSize = typedArray.getInt(i, 0);
            if (dimensionPixelSize == -4) {
                i4 = -2;
            } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                z2 = false;
            }
            if (!(obj instanceof ConstraintLayout.LayoutParams)) {
                ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams4).width = i4;
                    layoutParams4.f22647W = z2;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams4).height = i4;
                    layoutParams4.f22648X = z2;
                    return;
                }
            }
            if (obj instanceof Layout) {
                Layout layout3 = (Layout) obj;
                if (i2 == 0) {
                    layout3.f22780c = i4;
                    layout3.f22801m0 = z2;
                    return;
                } else {
                    layout3.f22782d = i4;
                    layout3.f22803n0 = z2;
                    return;
                }
            }
            if (obj instanceof Constraint.Delta) {
                Constraint.Delta delta3 = (Constraint.Delta) obj;
                if (i2 == 0) {
                    delta3.m7362b(23, i4);
                    delta3.m7364d(80, z2);
                    return;
                } else {
                    delta3.m7362b(21, i4);
                    delta3.m7364d(81, z2);
                    return;
                }
            }
            return;
        }
        dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        z2 = false;
        i4 = dimensionPixelSize;
        if (!(obj instanceof ConstraintLayout.LayoutParams)) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m7345o(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            byte b2 = -1;
            int i = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    b2 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    b2 = 1;
                }
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (b2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.f22631G = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m7346p(Constraint constraint, TypedArray typedArray) {
        char c2;
        int indexCount = typedArray.getIndexCount();
        Constraint.Delta delta = new Constraint.Delta();
        delta.f22737a = new int[10];
        delta.f22738b = new int[10];
        delta.f22739c = 0;
        delta.f22740d = new int[10];
        delta.f22741e = new float[10];
        delta.f22742f = 0;
        delta.f22743g = new int[5];
        delta.f22744h = new String[5];
        delta.f22745i = 0;
        delta.f22746j = new int[4];
        delta.f22747k = new boolean[4];
        delta.f22748l = 0;
        constraint.f22736h = delta;
        Motion motion = constraint.f22732d;
        motion.f22819a = false;
        Layout layout = constraint.f22733e;
        layout.f22778b = false;
        PropertySet propertySet = constraint.f22731c;
        propertySet.f22832a = false;
        Transform transform = constraint.f22734f;
        transform.f22838a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f22721j.get(index);
            SparseIntArray sparseIntArray = f22720i;
            switch (i2) {
                case 2:
                    c2 = 5;
                    delta.m7362b(2, typedArray.getDimensionPixelSize(index, layout.f22759J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case BuildConfig.VERSION_CODE /* 25 */:
                case 26:
                case 29:
                case 30:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case PDF417Common.MAX_ROWS_IN_BARCODE /* 90 */:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c2 = 5;
                    break;
                case 5:
                    c2 = 5;
                    delta.m7363c(5, typedArray.getString(index));
                    break;
                case 6:
                    delta.m7362b(6, typedArray.getDimensionPixelOffset(index, layout.f22753D));
                    c2 = 5;
                    break;
                case 7:
                    delta.m7362b(7, typedArray.getDimensionPixelOffset(index, layout.f22754E));
                    c2 = 5;
                    break;
                case 8:
                    delta.m7362b(8, typedArray.getDimensionPixelSize(index, layout.f22760K));
                    c2 = 5;
                    break;
                case 11:
                    delta.m7362b(11, typedArray.getDimensionPixelSize(index, layout.f22766Q));
                    c2 = 5;
                    break;
                case TYPE_BYTES_VALUE:
                    delta.m7362b(12, typedArray.getDimensionPixelSize(index, layout.f22767R));
                    c2 = 5;
                    break;
                case 13:
                    delta.m7362b(13, typedArray.getDimensionPixelSize(index, layout.f22763N));
                    c2 = 5;
                    break;
                case 14:
                    delta.m7362b(14, typedArray.getDimensionPixelSize(index, layout.f22765P));
                    c2 = 5;
                    break;
                case 15:
                    delta.m7362b(15, typedArray.getDimensionPixelSize(index, layout.f22768S));
                    c2 = 5;
                    break;
                case 16:
                    delta.m7362b(16, typedArray.getDimensionPixelSize(index, layout.f22764O));
                    c2 = 5;
                    break;
                case 17:
                    delta.m7362b(17, typedArray.getDimensionPixelOffset(index, layout.f22784e));
                    c2 = 5;
                    break;
                case 18:
                    delta.m7362b(18, typedArray.getDimensionPixelOffset(index, layout.f22786f));
                    c2 = 5;
                    break;
                case 19:
                    delta.m7361a(typedArray.getFloat(index, layout.f22788g), 19);
                    c2 = 5;
                    break;
                case 20:
                    delta.m7361a(typedArray.getFloat(index, layout.f22815x), 20);
                    c2 = 5;
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    delta.m7362b(21, typedArray.getLayoutDimension(index, layout.f22782d));
                    c2 = 5;
                    break;
                case 22:
                    delta.m7362b(22, f22719h[typedArray.getInt(index, propertySet.f22833b)]);
                    c2 = 5;
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    delta.m7362b(23, typedArray.getLayoutDimension(index, layout.f22780c));
                    c2 = 5;
                    break;
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                    delta.m7362b(24, typedArray.getDimensionPixelSize(index, layout.f22756G));
                    c2 = 5;
                    break;
                case 27:
                    delta.m7362b(27, typedArray.getInt(index, layout.f22755F));
                    c2 = 5;
                    break;
                case 28:
                    delta.m7362b(28, typedArray.getDimensionPixelSize(index, layout.f22757H));
                    c2 = 5;
                    break;
                case 31:
                    delta.m7362b(31, typedArray.getDimensionPixelSize(index, layout.f22761L));
                    c2 = 5;
                    break;
                case 34:
                    delta.m7362b(34, typedArray.getDimensionPixelSize(index, layout.f22758I));
                    c2 = 5;
                    break;
                case 37:
                    delta.m7361a(typedArray.getFloat(index, layout.f22816y), 37);
                    c2 = 5;
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, constraint.f22729a);
                    constraint.f22729a = resourceId;
                    delta.m7362b(38, resourceId);
                    c2 = 5;
                    break;
                case 39:
                    delta.m7361a(typedArray.getFloat(index, layout.f22771V), 39);
                    c2 = 5;
                    break;
                case 40:
                    delta.m7361a(typedArray.getFloat(index, layout.f22770U), 40);
                    c2 = 5;
                    break;
                case me.jessyan.autosize.BuildConfig.VERSION_CODE /* 41 */:
                    delta.m7362b(41, typedArray.getInt(index, layout.f22772W));
                    c2 = 5;
                    break;
                case 42:
                    delta.m7362b(42, typedArray.getInt(index, layout.f22773X));
                    c2 = 5;
                    break;
                case 43:
                    delta.m7361a(typedArray.getFloat(index, propertySet.f22835d), 43);
                    c2 = 5;
                    break;
                case Carousel.ENTITY_TYPE /* 44 */:
                    delta.m7364d(44, true);
                    delta.m7361a(typedArray.getDimension(index, transform.f22851n), 44);
                    c2 = 5;
                    break;
                case 45:
                    delta.m7361a(typedArray.getFloat(index, transform.f22840c), 45);
                    c2 = 5;
                    break;
                case 46:
                    delta.m7361a(typedArray.getFloat(index, transform.f22841d), 46);
                    c2 = 5;
                    break;
                case 47:
                    delta.m7361a(typedArray.getFloat(index, transform.f22842e), 47);
                    c2 = 5;
                    break;
                case 48:
                    delta.m7361a(typedArray.getFloat(index, transform.f22843f), 48);
                    c2 = 5;
                    break;
                case 49:
                    delta.m7361a(typedArray.getDimension(index, transform.f22844g), 49);
                    c2 = 5;
                    break;
                case 50:
                    delta.m7361a(typedArray.getDimension(index, transform.f22845h), 50);
                    c2 = 5;
                    break;
                case 51:
                    delta.m7361a(typedArray.getDimension(index, transform.f22847j), 51);
                    c2 = 5;
                    break;
                case 52:
                    delta.m7361a(typedArray.getDimension(index, transform.f22848k), 52);
                    c2 = 5;
                    break;
                case 53:
                    delta.m7361a(typedArray.getDimension(index, transform.f22849l), 53);
                    c2 = 5;
                    break;
                case 54:
                    delta.m7362b(54, typedArray.getInt(index, layout.f22774Y));
                    c2 = 5;
                    break;
                case 55:
                    delta.m7362b(55, typedArray.getInt(index, layout.f22775Z));
                    c2 = 5;
                    break;
                case 56:
                    delta.m7362b(56, typedArray.getDimensionPixelSize(index, layout.f22777a0));
                    c2 = 5;
                    break;
                case 57:
                    delta.m7362b(57, typedArray.getDimensionPixelSize(index, layout.f22779b0));
                    c2 = 5;
                    break;
                case 58:
                    delta.m7362b(58, typedArray.getDimensionPixelSize(index, layout.f22781c0));
                    c2 = 5;
                    break;
                case 59:
                    delta.m7362b(59, typedArray.getDimensionPixelSize(index, layout.f22783d0));
                    c2 = 5;
                    break;
                case 60:
                    delta.m7361a(typedArray.getFloat(index, transform.f22839b), 60);
                    c2 = 5;
                    break;
                case 62:
                    delta.m7362b(62, typedArray.getDimensionPixelSize(index, layout.f22751B));
                    c2 = 5;
                    break;
                case 63:
                    delta.m7361a(typedArray.getFloat(index, layout.f22752C), 63);
                    c2 = 5;
                    break;
                case UserMetadata.MAX_ATTRIBUTES /* 64 */:
                    delta.m7362b(64, m7343m(typedArray, index, motion.f22820b));
                    c2 = 5;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        delta.m7363c(65, typedArray.getString(index));
                    } else {
                        delta.m7363c(65, Easing.f21420c[typedArray.getInteger(index, 0)]);
                    }
                    c2 = 5;
                    break;
                case 66:
                    delta.m7362b(66, typedArray.getInt(index, 0));
                    c2 = 5;
                    break;
                case 67:
                    delta.m7361a(typedArray.getFloat(index, motion.f22826h), 67);
                    c2 = 5;
                    break;
                case 68:
                    delta.m7361a(typedArray.getFloat(index, propertySet.f22836e), 68);
                    c2 = 5;
                    break;
                case 69:
                    delta.m7361a(typedArray.getFloat(index, 1.0f), 69);
                    c2 = 5;
                    break;
                case 70:
                    delta.m7361a(typedArray.getFloat(index, 1.0f), 70);
                    c2 = 5;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    c2 = 5;
                    break;
                case 72:
                    delta.m7362b(72, typedArray.getInt(index, layout.f22789g0));
                    c2 = 5;
                    break;
                case 73:
                    delta.m7362b(73, typedArray.getDimensionPixelSize(index, layout.f22791h0));
                    c2 = 5;
                    break;
                case 74:
                    delta.m7363c(74, typedArray.getString(index));
                    c2 = 5;
                    break;
                case 75:
                    delta.m7364d(75, typedArray.getBoolean(index, layout.f22805o0));
                    c2 = 5;
                    break;
                case 76:
                    delta.m7362b(76, typedArray.getInt(index, motion.f22823e));
                    c2 = 5;
                    break;
                case 77:
                    delta.m7363c(77, typedArray.getString(index));
                    c2 = 5;
                    break;
                case 78:
                    delta.m7362b(78, typedArray.getInt(index, propertySet.f22834c));
                    c2 = 5;
                    break;
                case 79:
                    delta.m7361a(typedArray.getFloat(index, motion.f22825g), 79);
                    c2 = 5;
                    break;
                case 80:
                    delta.m7364d(80, typedArray.getBoolean(index, layout.f22801m0));
                    c2 = 5;
                    break;
                case 81:
                    delta.m7364d(81, typedArray.getBoolean(index, layout.f22803n0));
                    c2 = 5;
                    break;
                case 82:
                    delta.m7362b(82, typedArray.getInteger(index, motion.f22821c));
                    c2 = 5;
                    break;
                case 83:
                    delta.m7362b(83, m7343m(typedArray, index, transform.f22846i));
                    c2 = 5;
                    break;
                case 84:
                    delta.m7362b(84, typedArray.getInteger(index, motion.f22828j));
                    c2 = 5;
                    break;
                case SurveyViewModel.ENTITY_TYPE /* 85 */:
                    delta.m7361a(typedArray.getFloat(index, motion.f22827i), 85);
                    c2 = 5;
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        motion.f22831m = resourceId2;
                        delta.m7362b(89, resourceId2);
                        if (motion.f22831m != -1) {
                            motion.f22830l = -2;
                            delta.m7362b(88, -2);
                        }
                    } else if (i3 == 3) {
                        String string = typedArray.getString(index);
                        motion.f22829k = string;
                        delta.m7363c(90, string);
                        if (motion.f22829k.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            motion.f22831m = resourceId3;
                            delta.m7362b(89, resourceId3);
                            motion.f22830l = -2;
                            delta.m7362b(88, -2);
                        } else {
                            motion.f22830l = -1;
                            delta.m7362b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, motion.f22831m);
                        motion.f22830l = integer;
                        delta.m7362b(88, integer);
                    }
                    c2 = 5;
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c2 = 5;
                    break;
                case 93:
                    delta.m7362b(93, typedArray.getDimensionPixelSize(index, layout.f22762M));
                    c2 = 5;
                    break;
                case 94:
                    delta.m7362b(94, typedArray.getDimensionPixelSize(index, layout.f22769T));
                    c2 = 5;
                    break;
                case 95:
                    m7344n(delta, typedArray, index, 0);
                    c2 = 5;
                    break;
                case 96:
                    m7344n(delta, typedArray, index, 1);
                    c2 = 5;
                    break;
                case 97:
                    delta.m7362b(97, typedArray.getInt(index, layout.f22807p0));
                    c2 = 5;
                    break;
                case 98:
                    if (MotionLayout.f22317u0) {
                        int resourceId4 = typedArray.getResourceId(index, constraint.f22729a);
                        constraint.f22729a = resourceId4;
                        if (resourceId4 == -1) {
                            constraint.f22730b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        constraint.f22730b = typedArray.getString(index);
                    } else {
                        constraint.f22729a = typedArray.getResourceId(index, constraint.f22729a);
                    }
                    c2 = 5;
                    break;
                case 99:
                    delta.m7364d(99, typedArray.getBoolean(index, layout.f22790h));
                    c2 = 5;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7347a(MotionLayout motionLayout) {
        Constraint constraint;
        int childCount = motionLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = motionLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap map = this.f22728g;
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + Debug.m7212d(childAt));
            } else {
                if (this.f22727f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id)) && (constraint = (Constraint) map.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.m7317e(childAt, constraint.f22735g);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7348b(ConstraintSet constraintSet) {
        for (Constraint constraint : constraintSet.f22728g.values()) {
            if (constraint.f22736h != null) {
                if (constraint.f22730b == null) {
                    constraint.f22736h.m7365e(m7353j(constraint.f22729a));
                } else {
                    Iterator it = this.f22728g.keySet().iterator();
                    while (it.hasNext()) {
                        Constraint constraintM7353j = m7353j(((Integer) it.next()).intValue());
                        String str = constraintM7353j.f22733e.f22799l0;
                        if (str != null && constraint.f22730b.matches(str)) {
                            constraint.f22736h.m7365e(constraintM7353j);
                            constraintM7353j.f22735g.putAll((HashMap) constraint.f22735g.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7349c(ConstraintLayout constraintLayout) {
        m7350d(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m7350d(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f22728g;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + Debug.m7212d(childAt));
            } else {
                if (this.f22727f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        Constraint constraint = (Constraint) map.get(Integer.valueOf(id));
                        if (constraint != null) {
                            if (childAt instanceof Barrier) {
                                Layout layout = constraint.f22733e;
                                layout.f22793i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(layout.f22789g0);
                                barrier.setMargin(layout.f22791h0);
                                barrier.setAllowsGoneWidget(layout.f22805o0);
                                int[] iArr = layout.f22795j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = layout.f22797k0;
                                    if (str != null) {
                                        int[] iArrM7341g = m7341g(barrier, str);
                                        layout.f22795j0 = iArrM7341g;
                                        barrier.setReferencedIds(iArrM7341g);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.m7334a();
                            constraint.m7357b(layoutParams);
                            ConstraintAttribute.m7317e(childAt, constraint.f22735g);
                            childAt.setLayoutParams(layoutParams);
                            PropertySet propertySet = constraint.f22731c;
                            if (propertySet.f22834c == 0) {
                                childAt.setVisibility(propertySet.f22833b);
                            }
                            childAt.setAlpha(propertySet.f22835d);
                            Transform transform = constraint.f22734f;
                            childAt.setRotation(transform.f22839b);
                            childAt.setRotationX(transform.f22840c);
                            childAt.setRotationY(transform.f22841d);
                            childAt.setScaleX(transform.f22842e);
                            childAt.setScaleY(transform.f22843f);
                            if (transform.f22846i != -1) {
                                if (((View) childAt.getParent()).findViewById(transform.f22846i) != null) {
                                    float bottom = (r7.getBottom() + r7.getTop()) / 2.0f;
                                    float right = (r7.getRight() + r7.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(transform.f22844g)) {
                                    childAt.setPivotX(transform.f22844g);
                                }
                                if (!Float.isNaN(transform.f22845h)) {
                                    childAt.setPivotY(transform.f22845h);
                                }
                            }
                            childAt.setTranslationX(transform.f22847j);
                            childAt.setTranslationY(transform.f22848k);
                            childAt.setTranslationZ(transform.f22849l);
                            if (transform.f22850m) {
                                childAt.setElevation(transform.f22851n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            Constraint constraint2 = (Constraint) map.get(num);
            if (constraint2 != null) {
                Layout layout2 = constraint2.f22733e;
                if (layout2.f22793i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = layout2.f22795j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = layout2.f22797k0;
                        if (str2 != null) {
                            int[] iArrM7341g2 = m7341g(barrier2, str2);
                            layout2.f22795j0 = iArrM7341g2;
                            barrier2.setReferencedIds(iArrM7341g2);
                        }
                    }
                    barrier2.setType(layout2.f22789g0);
                    barrier2.setMargin(layout2.f22791h0);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.m7331q();
                    constraint2.m7357b(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (layout2.f22776a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.m7357b(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).mo7191g(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7351f(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i2;
        HashMap map2;
        int i3;
        ConstraintSet constraintSet = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = constraintSet.f22728g;
        map3.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (constraintSet.f22727f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = (Constraint) map3.get(Integer.valueOf(id));
            if (constraint == null) {
                i = childCount;
                map = map3;
                i2 = i4;
            } else {
                HashMap map4 = constraintSet.f22726e;
                HashMap map5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    ConstraintAttribute constraintAttribute = (ConstraintAttribute) map4.get(str);
                    int i5 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                                i3 = i4;
                            } catch (IllegalAccessException e) {
                                e = e;
                                i3 = i4;
                                StringBuilder sbM23t = AbstractC0000a.m23t(" Custom Attribute \"", str, "\" not found on ");
                                sbM23t.append(cls.getName());
                                Log.e("TransitionLayout", sbM23t.toString(), e);
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                i3 = i4;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                i3 = i4;
                                StringBuilder sbM23t2 = AbstractC0000a.m23t(" Custom Attribute \"", str, "\" not found on ");
                                sbM23t2.append(cls.getName());
                                Log.e("TransitionLayout", sbM23t2.toString(), e);
                            }
                        } else {
                            map2 = map3;
                            i3 = i4;
                            try {
                                map5.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                StringBuilder sbM23t3 = AbstractC0000a.m23t(" Custom Attribute \"", str, "\" not found on ");
                                sbM23t3.append(cls.getName());
                                Log.e("TransitionLayout", sbM23t3.toString(), e);
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                            } catch (InvocationTargetException e6) {
                                e = e6;
                                StringBuilder sbM23t22 = AbstractC0000a.m23t(" Custom Attribute \"", str, "\" not found on ");
                                sbM23t22.append(cls.getName());
                                Log.e("TransitionLayout", sbM23t22.toString(), e);
                            }
                        }
                    } catch (IllegalAccessException e7) {
                        e = e7;
                        map2 = map3;
                    } catch (NoSuchMethodException e8) {
                        e = e8;
                        map2 = map3;
                    } catch (InvocationTargetException e9) {
                        e = e9;
                        map2 = map3;
                    }
                    i4 = i3;
                    childCount = i5;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                i2 = i4;
                constraint.f22735g = map5;
                constraint.m7359d(id, layoutParams);
                int visibility = childAt.getVisibility();
                PropertySet propertySet = constraint.f22731c;
                propertySet.f22833b = visibility;
                propertySet.f22835d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                Transform transform = constraint.f22734f;
                transform.f22839b = rotation;
                transform.f22840c = childAt.getRotationX();
                transform.f22841d = childAt.getRotationY();
                transform.f22842e = childAt.getScaleX();
                transform.f22843f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    transform.f22844g = pivotX;
                    transform.f22845h = pivotY;
                }
                transform.f22847j = childAt.getTranslationX();
                transform.f22848k = childAt.getTranslationY();
                transform.f22849l = childAt.getTranslationZ();
                if (transform.f22850m) {
                    transform.f22851n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    Layout layout = constraint.f22733e;
                    layout.f22805o0 = allowsGoneWidget;
                    layout.f22795j0 = barrier.getReferencedIds();
                    layout.f22789g0 = barrier.getType();
                    layout.f22791h0 = barrier.getMargin();
                }
            }
            i4 = i2 + 1;
            constraintSet = this;
            childCount = i;
            map3 = map;
        }
    }

    /* JADX INFO: renamed from: i */
    public final Constraint m7352i(int i) {
        HashMap map = this.f22728g;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), new Constraint());
        }
        return (Constraint) map.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: j */
    public final Constraint m7353j(int i) {
        HashMap map = this.f22728g;
        if (map.containsKey(Integer.valueOf(i))) {
            return (Constraint) map.get(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m7354k(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    Constraint constraintM7342h = m7342h(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        constraintM7342h.f22733e.f22776a = true;
                    }
                    this.f22728g.put(Integer.valueOf(constraintM7342h.f22729a), constraintM7342h);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d2, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7355l(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            Constraint constraintM7342h = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    switch (xmlResourceParser.getName()) {
                        case "Constraint":
                            constraintM7342h = m7342h(context, Xml.asAttributeSet(xmlResourceParser), false);
                            break;
                        case "ConstraintOverride":
                            constraintM7342h = m7342h(context, Xml.asAttributeSet(xmlResourceParser), true);
                            break;
                        case "Guideline":
                            constraintM7342h = m7342h(context, Xml.asAttributeSet(xmlResourceParser), false);
                            Layout layout = constraintM7342h.f22733e;
                            layout.f22776a = true;
                            layout.f22778b = true;
                            break;
                        case "Barrier":
                            constraintM7342h = m7342h(context, Xml.asAttributeSet(xmlResourceParser), false);
                            constraintM7342h.f22733e.f22793i0 = 1;
                            break;
                        case "PropertySet":
                            if (constraintM7342h == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            constraintM7342h.f22731c.m7370a(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Transform":
                            if (constraintM7342h == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            constraintM7342h.f22734f.m7372b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Layout":
                            if (constraintM7342h == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            constraintM7342h.f22733e.m7367b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Motion":
                            if (constraintM7342h == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            constraintM7342h.f22732d.m7369b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (constraintM7342h == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            ConstraintAttribute.m7316d(context, xmlResourceParser, constraintM7342h.f22735g);
                            break;
                            break;
                    }
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r6 == 0) {
                        return;
                    }
                    if (r6 == 1 || r6 == 2 || r6 == 3) {
                        this.f22728g.put(Integer.valueOf(constraintM7342h.f22729a), constraintM7342h);
                        constraintM7342h = null;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        }
    }
}
