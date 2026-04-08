package org.mp4parser.boxes.iso14496.part15;

import java.util.ArrayList;
import p001A.AbstractC0000a;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
public class AvcDecoderConfigurationRecord {

    /* JADX INFO: renamed from: a */
    public int f58941a;

    /* JADX INFO: renamed from: b */
    public int f58942b;

    /* JADX INFO: renamed from: c */
    public int f58943c;

    /* JADX INFO: renamed from: d */
    public int f58944d;

    /* JADX INFO: renamed from: e */
    public int f58945e;

    /* JADX INFO: renamed from: f */
    public ArrayList f58946f;

    /* JADX INFO: renamed from: g */
    public ArrayList f58947g;

    /* JADX INFO: renamed from: h */
    public boolean f58948h;

    /* JADX INFO: renamed from: i */
    public int f58949i;

    /* JADX INFO: renamed from: j */
    public int f58950j;

    /* JADX INFO: renamed from: k */
    public int f58951k;

    /* JADX INFO: renamed from: l */
    public ArrayList f58952l;

    /* JADX INFO: renamed from: m */
    public int f58953m;

    /* JADX INFO: renamed from: n */
    public int f58954n;

    /* JADX INFO: renamed from: o */
    public int f58955o;

    /* JADX INFO: renamed from: p */
    public int f58956p;

    /* JADX INFO: renamed from: q */
    public int f58957q;

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvcDecoderConfigurationRecord{configurationVersion=");
        sb.append(this.f58941a);
        sb.append(", avcProfileIndication=");
        sb.append(this.f58942b);
        sb.append(", profileCompatibility=");
        sb.append(this.f58943c);
        sb.append(", avcLevelIndication=");
        sb.append(this.f58944d);
        sb.append(", lengthSizeMinusOne=");
        sb.append(this.f58945e);
        sb.append(", hasExts=");
        sb.append(this.f58948h);
        sb.append(", chromaFormat=");
        sb.append(this.f58949i);
        sb.append(", bitDepthLumaMinus8=");
        sb.append(this.f58950j);
        sb.append(", bitDepthChromaMinus8=");
        sb.append(this.f58951k);
        sb.append(", lengthSizeMinusOnePaddingBits=");
        sb.append(this.f58953m);
        sb.append(", numberOfSequenceParameterSetsPaddingBits=");
        sb.append(this.f58954n);
        sb.append(", chromaFormatPaddingBits=");
        sb.append(this.f58955o);
        sb.append(", bitDepthLumaMinus8PaddingBits=");
        sb.append(this.f58956p);
        sb.append(", bitDepthChromaMinus8PaddingBits=");
        return AbstractC0000a.m17n(sb, this.f58957q, '}');
    }
}
