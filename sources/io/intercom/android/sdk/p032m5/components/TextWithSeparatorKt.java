package io.intercom.android.sdk.p032m5.components;

import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.platform.AbstractC1313i;
import androidx.compose.p013ui.semantics.SemanticsModifierKt;
import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.intercom.android.sdk.p041ui.IntercomPreviews;
import io.intercom.android.sdk.p041ui.theme.IntercomTheme;
import io.intercom.android.sdk.p041ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Proguard */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18301d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0018"}, m18302d2 = {"TextWithSeparator", "", "firstText", "", "secondText", "modifier", "Landroidx/compose/ui/Modifier;", "separator", "style", "Landroidx/compose/ui/text/TextStyle;", "color", "Landroidx/compose/ui/graphics/Color;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "TextWithSeparator-wV1YYcM", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;JIILandroidx/compose/ui/text/style/TextAlign;Landroidx/compose/runtime/Composer;II)V", "TextWithSeparatorPreview", "(Landroidx/compose/runtime/Composer;I)V", "TextWithSeparatorSecondEmptyPreview", "TextWithSeparatorFirstEmptyPreview", "intercom-sdk-base_release"}, m18303k = 2, m18304mv = {2, 0, 0}, m18306xi = 48)
@SourceDebugExtension
public final class TextWithSeparatorKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    @ComposableTarget
    @Composable
    /* JADX INFO: renamed from: TextWithSeparator-wV1YYcM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m22166TextWithSeparatorwV1YYcM(@NotNull String firstText, @NotNull String secondText, @Nullable Modifier modifier, @Nullable String str, @Nullable TextStyle textStyle, long j, int i, int i2, @Nullable TextAlign textAlign, @Nullable Composer composer, int i3, int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        String str2;
        TextStyle textStyle2;
        int i7;
        long j2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Modifier modifier3;
        String str3;
        TextStyle type04;
        TextAlign textAlign2;
        int i13;
        TextStyle textStyle3;
        long j3;
        int i14;
        boolean z2;
        Object objMo4229g;
        ComposerImpl composerImpl;
        String str4;
        long j4;
        TextAlign textAlign3;
        int i15;
        int i16;
        TextStyle textStyle4;
        RecomposeScopeImpl recomposeScopeImplM4267Y;
        int i17;
        Intrinsics.m18599g(firstText, "firstText");
        Intrinsics.m18599g(secondText, "secondText");
        ComposerImpl composerImplMo4239q = composer.mo4239q(46249171);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (composerImplMo4239q.mo4220M(firstText) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= composerImplMo4239q.mo4220M(secondText) ? 32 : 16;
        }
        int i18 = i4 & 4;
        if (i18 != 0) {
            i5 |= 384;
        } else {
            if ((i3 & 896) == 0) {
                modifier2 = modifier;
                i5 |= composerImplMo4239q.mo4220M(modifier2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else {
                if ((i3 & 7168) == 0) {
                    str2 = str;
                    i5 |= composerImplMo4239q.mo4220M(str2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                if ((57344 & i3) == 0) {
                    if ((i4 & 16) == 0) {
                        textStyle2 = textStyle;
                        if (composerImplMo4239q.mo4220M(textStyle2)) {
                            i17 = 16384;
                        }
                        i5 |= i17;
                    } else {
                        textStyle2 = textStyle;
                    }
                    i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    i5 |= i17;
                } else {
                    textStyle2 = textStyle;
                }
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= 196608;
                } else {
                    if ((458752 & i3) == 0) {
                        j2 = j;
                        i5 |= composerImplMo4239q.mo4233k(j2) ? 131072 : 65536;
                    }
                    i8 = i4 & 64;
                    if (i8 == 0) {
                        i5 |= 1572864;
                    } else if ((i3 & 3670016) == 0) {
                        i5 |= composerImplMo4239q.mo4232j(i) ? 1048576 : 524288;
                    }
                    i9 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    if (i9 == 0) {
                        i5 |= 12582912;
                    } else {
                        if ((i3 & 29360128) == 0) {
                            i10 = i5 | (composerImplMo4239q.mo4232j(i2) ? 8388608 : 4194304);
                        }
                        i11 = i4 & 256;
                        if (i11 == 0) {
                            if ((i3 & 234881024) == 0) {
                                i12 = i11;
                                i10 |= composerImplMo4239q.mo4220M(textAlign) ? 67108864 : 33554432;
                            }
                            if ((i10 & 191739611) == 38347922 || !composerImplMo4239q.mo4242t()) {
                                composerImplMo4239q.m4287v0();
                                if ((i3 & 1) != 0 || composerImplMo4239q.m4272d0()) {
                                    modifier3 = i18 == 0 ? Modifier.Companion.f17180a : modifier2;
                                    str3 = i6 == 0 ? "•" : str2;
                                    if ((i4 & 16) == 0) {
                                        type04 = IntercomTheme.INSTANCE.getTypography(composerImplMo4239q, IntercomTheme.$stable).getType04();
                                        i10 &= -57345;
                                    } else {
                                        type04 = textStyle2;
                                    }
                                    long j5 = i7 == 0 ? Color.f17583k : j2;
                                    int i19 = i8 == 0 ? 1 : i;
                                    int i20 = i9 == 0 ? Integer.MAX_VALUE : i2;
                                    if (i12 == 0) {
                                        i13 = i20;
                                        textStyle3 = type04;
                                        j3 = j5;
                                        i14 = i19;
                                        textAlign2 = null;
                                    } else {
                                        textAlign2 = textAlign;
                                        i13 = i20;
                                        textStyle3 = type04;
                                        j3 = j5;
                                        i14 = i19;
                                    }
                                } else {
                                    composerImplMo4239q.mo4246x();
                                    if ((i4 & 16) != 0) {
                                        i10 &= -57345;
                                    }
                                    i14 = i;
                                    i13 = i2;
                                    textAlign2 = textAlign;
                                    modifier3 = modifier2;
                                    str3 = str2;
                                    textStyle3 = textStyle2;
                                    j3 = j2;
                                }
                                composerImplMo4239q.m4266X();
                                String str5 = firstText + ((!StringsKt.m20448x(firstText) || StringsKt.m20448x(secondText)) ? "" : AbstractC1313i.m6244a(' ', " ", str3)) + secondText;
                                composerImplMo4239q.mo4221N(598373073);
                                z2 = ((i10 & 112) == 32) | ((i10 & 14) != 4);
                                objMo4229g = composerImplMo4239q.mo4229g();
                                if (!z2 || objMo4229g == Composer.Companion.f16228a) {
                                    objMo4229g = new C5303w(firstText, secondText);
                                    composerImplMo4239q.mo4214G(objMo4229g);
                                }
                                composerImplMo4239q.m4265W(false);
                                composerImpl = composerImplMo4239q;
                                TextKt.m4084b(str5, SemanticsModifierKt.m6270b(modifier3, false, (Function1) objMo4229g), j3, 0L, null, null, null, 0L, null, textAlign2, 0L, i14, false, i13, 0, null, textStyle3, composerImpl, ((i10 >> 9) & 896) | ((i10 << 3) & 1879048192), ((i10 >> 15) & 112) | ((i10 >> 12) & 7168) | ((i10 << 6) & 3670016), 54776);
                                str4 = str3;
                                j4 = j3;
                                textAlign3 = textAlign2;
                                i15 = i14;
                                i16 = i13;
                                textStyle4 = textStyle3;
                            } else {
                                composerImplMo4239q.mo4246x();
                                i15 = i;
                                composerImpl = composerImplMo4239q;
                                modifier3 = modifier2;
                                str4 = str2;
                                textStyle4 = textStyle2;
                                j4 = j2;
                                i16 = i2;
                                textAlign3 = textAlign;
                            }
                            recomposeScopeImplM4267Y = composerImpl.m4267Y();
                            if (recomposeScopeImplM4267Y == null) {
                                recomposeScopeImplM4267Y.f16451d = new C5304x(firstText, secondText, modifier3, str4, textStyle4, j4, i15, i16, textAlign3, i3, i4);
                                return;
                            }
                            return;
                        }
                        i10 |= 100663296;
                        i12 = i11;
                        if ((i10 & 191739611) == 38347922) {
                            composerImplMo4239q.m4287v0();
                            if ((i3 & 1) != 0) {
                                if (i18 == 0) {
                                }
                                if (i6 == 0) {
                                }
                                if ((i4 & 16) == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i12 == 0) {
                                }
                                composerImplMo4239q.m4266X();
                                if (StringsKt.m20448x(firstText)) {
                                    String str52 = firstText + ((!StringsKt.m20448x(firstText) || StringsKt.m20448x(secondText)) ? "" : AbstractC1313i.m6244a(' ', " ", str3)) + secondText;
                                    composerImplMo4239q.mo4221N(598373073);
                                    if ((i10 & 14) != 4) {
                                    }
                                    z2 = ((i10 & 112) == 32) | ((i10 & 14) != 4);
                                    objMo4229g = composerImplMo4239q.mo4229g();
                                    if (!z2) {
                                        objMo4229g = new C5303w(firstText, secondText);
                                        composerImplMo4239q.mo4214G(objMo4229g);
                                        composerImplMo4239q.m4265W(false);
                                        composerImpl = composerImplMo4239q;
                                        TextKt.m4084b(str52, SemanticsModifierKt.m6270b(modifier3, false, (Function1) objMo4229g), j3, 0L, null, null, null, 0L, null, textAlign2, 0L, i14, false, i13, 0, null, textStyle3, composerImpl, ((i10 >> 9) & 896) | ((i10 << 3) & 1879048192), ((i10 >> 15) & 112) | ((i10 >> 12) & 7168) | ((i10 << 6) & 3670016), 54776);
                                        str4 = str3;
                                        j4 = j3;
                                        textAlign3 = textAlign2;
                                        i15 = i14;
                                        i16 = i13;
                                        textStyle4 = textStyle3;
                                    }
                                }
                            }
                        }
                        recomposeScopeImplM4267Y = composerImpl.m4267Y();
                        if (recomposeScopeImplM4267Y == null) {
                        }
                    }
                    i10 = i5;
                    i11 = i4 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if ((i10 & 191739611) == 38347922) {
                    }
                    recomposeScopeImplM4267Y = composerImpl.m4267Y();
                    if (recomposeScopeImplM4267Y == null) {
                    }
                }
                j2 = j;
                i8 = i4 & 64;
                if (i8 == 0) {
                }
                i9 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i9 == 0) {
                }
                i10 = i5;
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                if ((i10 & 191739611) == 38347922) {
                }
                recomposeScopeImplM4267Y = composerImpl.m4267Y();
                if (recomposeScopeImplM4267Y == null) {
                }
            }
            str2 = str;
            if ((57344 & i3) == 0) {
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            j2 = j;
            i8 = i4 & 64;
            if (i8 == 0) {
            }
            i9 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i9 == 0) {
            }
            i10 = i5;
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            if ((i10 & 191739611) == 38347922) {
            }
            recomposeScopeImplM4267Y = composerImpl.m4267Y();
            if (recomposeScopeImplM4267Y == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        str2 = str;
        if ((57344 & i3) == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        j2 = j;
        i8 = i4 & 64;
        if (i8 == 0) {
        }
        i9 = i4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i9 == 0) {
        }
        i10 = i5;
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        if ((i10 & 191739611) == 38347922) {
        }
        recomposeScopeImplM4267Y = composerImpl.m4267Y();
        if (recomposeScopeImplM4267Y == null) {
        }
    }

    @ComposableTarget
    @IntercomPreviews
    @Composable
    private static final void TextWithSeparatorFirstEmptyPreview(Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(1116705163);
        if (i == 0 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m22155getLambda3$intercom_sdk_base_release(), composerImplMo4239q, 3072, 7);
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C5291k(i, 16);
        }
    }

    private static final Unit TextWithSeparatorFirstEmptyPreview$lambda$5(int i, Composer composer, int i2) {
        TextWithSeparatorFirstEmptyPreview(composer, RecomposeScopeImplKt.m4417a(i | 1));
        return Unit.f51459a;
    }

    @ComposableTarget
    @IntercomPreviews
    @Composable
    private static final void TextWithSeparatorPreview(Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(1364601736);
        if (i == 0 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m22153getLambda1$intercom_sdk_base_release(), composerImplMo4239q, 3072, 7);
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C5291k(i, 14);
        }
    }

    private static final Unit TextWithSeparatorPreview$lambda$3(int i, Composer composer, int i2) {
        TextWithSeparatorPreview(composer, RecomposeScopeImplKt.m4417a(i | 1));
        return Unit.f51459a;
    }

    @ComposableTarget
    @IntercomPreviews
    @Composable
    private static final void TextWithSeparatorSecondEmptyPreview(Composer composer, int i) {
        ComposerImpl composerImplMo4239q = composer.mo4239q(1899699287);
        if (i == 0 && composerImplMo4239q.mo4242t()) {
            composerImplMo4239q.mo4246x();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TextWithSeparatorKt.INSTANCE.m22154getLambda2$intercom_sdk_base_release(), composerImplMo4239q, 3072, 7);
        }
        RecomposeScopeImpl recomposeScopeImplM4267Y = composerImplMo4239q.m4267Y();
        if (recomposeScopeImplM4267Y != null) {
            recomposeScopeImplM4267Y.f16451d = new C5291k(i, 15);
        }
    }

    private static final Unit TextWithSeparatorSecondEmptyPreview$lambda$4(int i, Composer composer, int i2) {
        TextWithSeparatorSecondEmptyPreview(composer, RecomposeScopeImplKt.m4417a(i | 1));
        return Unit.f51459a;
    }

    private static final Unit TextWithSeparator_wV1YYcM$lambda$1$lambda$0(String firstText, String secondText, SemanticsPropertyReceiver semantics) {
        Intrinsics.m18599g(firstText, "$firstText");
        Intrinsics.m18599g(secondText, "$secondText");
        Intrinsics.m18599g(semantics, "$this$semantics");
        SemanticsPropertiesKt.m6298j(firstText + ' ' + secondText, semantics);
        return Unit.f51459a;
    }

    private static final Unit TextWithSeparator_wV1YYcM$lambda$2(String firstText, String secondText, Modifier modifier, String str, TextStyle textStyle, long j, int i, int i2, TextAlign textAlign, int i3, int i4, Composer composer, int i5) {
        Intrinsics.m18599g(firstText, "$firstText");
        Intrinsics.m18599g(secondText, "$secondText");
        m22166TextWithSeparatorwV1YYcM(firstText, secondText, modifier, str, textStyle, j, i, i2, textAlign, composer, RecomposeScopeImplKt.m4417a(i3 | 1), i4);
        return Unit.f51459a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m15632a(String str, String str2, Modifier modifier, String str3, TextStyle textStyle, long j, int i, int i2, TextAlign textAlign, int i3, int i4, Composer composer, int i5) {
        return TextWithSeparator_wV1YYcM$lambda$2(str, str2, modifier, str3, textStyle, j, i, i2, textAlign, i3, i4, composer, i5);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m15633b(int i, Composer composer, int i2) {
        return TextWithSeparatorFirstEmptyPreview$lambda$5(i, composer, i2);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Unit m15634c(int i, Composer composer, int i2) {
        return TextWithSeparatorPreview$lambda$3(i, composer, i2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Unit m15635d(int i, Composer composer, int i2) {
        return TextWithSeparatorSecondEmptyPreview$lambda$4(i, composer, i2);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Unit m15636e(String str, String str2, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return TextWithSeparator_wV1YYcM$lambda$1$lambda$0(str, str2, semanticsPropertyReceiver);
    }
}
