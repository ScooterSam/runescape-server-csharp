/* Class77 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class77
{
    public static int[] anIntArray1584 = { 256, 128, 86, 64 };
    public int[] anIntArray1585;
    public int[] anIntArray1586;
    public static int[] anIntArray1587;
    public static boolean[] aBooleanArray1588;
    public static float[] aFloatArray1589
	= { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F,
	    1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F,
	    1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F,
	    2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F,
	    2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F,
	    3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F,
	    4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F,
	    6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F,
	    7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F,
	    1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F,
	    1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F,
	    1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F,
	    2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F,
	    2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F,
	    3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F,
	    4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F,
	    5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F,
	    7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F,
	    1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F,
	    1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F,
	    1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F,
	    2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F,
	    2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F,
	    3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F,
	    4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F,
	    6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F,
	    7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F,
	    1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F,
	    1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F,
	    1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F,
	    2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F,
	    2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F,
	    3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F,
	    4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F,
	    5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F,
	    7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F,
	    9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F,
	    0.0012634633F, 0.0013455702F, 0.0014330129F, 0.0015261382F,
	    0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F,
	    0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F,
	    0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F,
	    0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F,
	    0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F,
	    0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F,
	    0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F,
	    0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F,
	    0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F,
	    0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F,
	    0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F,
	    0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F,
	    0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F,
	    0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F,
	    0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F,
	    0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F,
	    0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F,
	    0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F,
	    0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F,
	    0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F,
	    0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F,
	    0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F,
	    0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
    public static int[] anIntArray1590;
    public int[] anIntArray1591;
    public int anInt1592;
    public int[] anIntArray1593;
    public int[][] anIntArrayArray1594;
    public int[] anIntArray1595;
    
    public int method1402(int arg0, int arg1, int arg2, int arg3, int arg4) {
	int i = arg3 - arg1;
	int i_0_ = arg2 - arg0;
	int i_1_ = i < 0 ? -i : i;
	int i_2_ = i_1_ * (arg4 - arg0);
	int i_3_ = i_2_ / i_0_;
	if (i < 0)
	    return arg1 - i_3_;
	return arg1 + i_3_;
    }
    
    public boolean method1403() {
	boolean bool = Class67_Sub18.method1252() != 0;
	if (!bool)
	    return false;
	int i = anIntArray1595.length;
	for (int i_4_ = 0; i_4_ < i; i_4_++)
	    anIntArray1590[i_4_] = anIntArray1595[i_4_];
	int i_5_ = anIntArray1584[anInt1592 - 1];
	int i_6_ = Class76.method1400((byte) -22, i_5_ - 1);
	anIntArray1587[0] = Class67_Sub18.method1259(i_6_);
	anIntArray1587[1] = Class67_Sub18.method1259(i_6_);
	int i_7_ = 2;
	for (int i_8_ = 0; i_8_ < anIntArray1591.length; i_8_++) {
	    int i_9_ = anIntArray1591[i_8_];
	    int i_10_ = anIntArray1586[i_9_];
	    int i_11_ = anIntArray1593[i_9_];
	    int i_12_ = (1 << i_11_) - 1;
	    int i_13_ = 0;
	    if (i_11_ > 0)
		i_13_ = Class67_Sub18.aClass29Array3118
			    [anIntArray1585[i_9_]].method281();
	    for (int i_14_ = 0; i_14_ < i_10_; i_14_++) {
		int i_15_ = anIntArrayArray1594[i_9_][i_13_ & i_12_];
		i_13_ >>>= i_11_;
		anIntArray1587[i_7_++]
		    = (i_15_ >= 0
		       ? Class67_Sub18.aClass29Array3118[i_15_].method281()
		       : 0);
	    }
	}
	return true;
    }
    
    public void method1404(int arg0, int arg1) {
	if (arg0 < arg1) {
	    int i = arg0;
	    int i_16_ = anIntArray1590[i];
	    int i_17_ = anIntArray1587[i];
	    boolean bool = aBooleanArray1588[i];
	    for (int i_18_ = arg0 + 1; i_18_ <= arg1; i_18_++) {
		int i_19_ = anIntArray1590[i_18_];
		if (i_19_ < i_16_) {
		    anIntArray1590[i] = i_19_;
		    anIntArray1587[i] = anIntArray1587[i_18_];
		    aBooleanArray1588[i] = aBooleanArray1588[i_18_];
		    i++;
		    anIntArray1590[i_18_] = anIntArray1590[i];
		    anIntArray1587[i_18_] = anIntArray1587[i];
		    aBooleanArray1588[i_18_] = aBooleanArray1588[i];
		}
	    }
	    anIntArray1590[i] = i_16_;
	    anIntArray1587[i] = i_17_;
	    aBooleanArray1588[i] = bool;
	    method1404(arg0, i - 1);
	    method1404(i + 1, arg1);
	}
    }
    
    public static void method1405() {
	anIntArray1584 = null;
	aFloatArray1589 = null;
	anIntArray1590 = null;
	anIntArray1587 = null;
	aBooleanArray1588 = null;
    }
    
    public void method1406(int arg0, int arg1, int arg2, int arg3,
			   float[] arg4, int arg5) {
	int i = arg3 - arg1;
	int i_20_ = arg2 - arg0;
	int i_21_ = i < 0 ? -i : i;
	int i_22_ = i / i_20_;
	int i_23_ = arg1;
	int i_24_ = 0;
	int i_25_ = i < 0 ? i_22_ - 1 : i_22_ + 1;
	i_21_ = i_21_ - (i_22_ < 0 ? -i_22_ : i_22_) * i_20_;
	arg4[arg0] *= aFloatArray1589[i_23_];
	if (arg2 > arg5)
	    arg2 = arg5;
	for (int i_26_ = arg0 + 1; i_26_ < arg2; i_26_++) {
	    i_24_ += i_21_;
	    if (i_24_ >= i_20_) {
		i_24_ -= i_20_;
		i_23_ += i_25_;
	    } else
		i_23_ += i_22_;
	    arg4[i_26_] *= aFloatArray1589[i_23_];
	}
    }
    
    public void method1407(float[] arg0, int arg1) {
	int i = anIntArray1595.length;
	int i_27_ = anIntArray1584[anInt1592 - 1];
	aBooleanArray1588[0] = aBooleanArray1588[1] = true;
	for (int i_28_ = 2; i_28_ < i; i_28_++) {
	    int i_29_ = method1408(anIntArray1590, i_28_);
	    int i_30_ = method1409(anIntArray1590, i_28_);
	    int i_31_
		= method1402(anIntArray1590[i_29_], anIntArray1587[i_29_],
			     anIntArray1590[i_30_], anIntArray1587[i_30_],
			     anIntArray1590[i_28_]);
	    int i_32_ = anIntArray1587[i_28_];
	    int i_33_ = i_27_ - i_31_;
	    int i_34_ = i_31_;
	    int i_35_ = (i_33_ < i_34_ ? i_33_ : i_34_) << 1;
	    if (i_32_ != 0) {
		aBooleanArray1588[i_29_] = aBooleanArray1588[i_30_] = true;
		aBooleanArray1588[i_28_] = true;
		if (i_32_ >= i_35_)
		    anIntArray1587[i_28_]
			= (i_33_ > i_34_ ? i_32_ - i_34_ + i_31_
			   : i_31_ - i_32_ + i_33_ - 1);
		else
		    anIntArray1587[i_28_]
			= ((i_32_ & 0x1) != 0 ? i_31_ - (i_32_ + 1) / 2
			   : i_31_ + i_32_ / 2);
	    } else {
		aBooleanArray1588[i_28_] = false;
		anIntArray1587[i_28_] = i_31_;
	    }
	}
	method1404(0, i - 1);
	int i_36_ = 0;
	int i_37_ = anIntArray1587[0] * anInt1592;
	for (int i_38_ = 1; i_38_ < i; i_38_++) {
	    if (aBooleanArray1588[i_38_]) {
		int i_39_ = anIntArray1590[i_38_];
		int i_40_ = anIntArray1587[i_38_] * anInt1592;
		method1406(i_36_, i_37_, i_39_, i_40_, arg0, arg1);
		if (i_39_ >= arg1)
		    return;
		i_36_ = i_39_;
		i_37_ = i_40_;
	    }
	}
	float f = aFloatArray1589[i_37_];
	for (int i_41_ = i_36_; i_41_ < arg1; i_41_++)
	    arg0[i_41_] *= f;
    }
    
    public static int method1408(int[] arg0, int arg1) {
	int i = arg0[arg1];
	int i_42_ = -1;
	int i_43_ = -2147483648;
	for (int i_44_ = 0; i_44_ < arg1; i_44_++) {
	    int i_45_ = arg0[i_44_];
	    if (i_45_ < i && i_45_ > i_43_) {
		i_42_ = i_44_;
		i_43_ = i_45_;
	    }
	}
	return i_42_;
    }
    
    public Class77() {
	int i = Class67_Sub18.method1259(16);
	if (i != 1)
	    throw new RuntimeException();
	int i_46_ = Class67_Sub18.method1259(5);
	int i_47_ = 0;
	anIntArray1591 = new int[i_46_];
	for (int i_48_ = 0; i_48_ < i_46_; i_48_++) {
	    int i_49_ = Class67_Sub18.method1259(4);
	    anIntArray1591[i_48_] = i_49_;
	    if (i_49_ >= i_47_)
		i_47_ = i_49_ + 1;
	}
	anIntArray1586 = new int[i_47_];
	anIntArray1593 = new int[i_47_];
	anIntArray1585 = new int[i_47_];
	anIntArrayArray1594 = new int[i_47_][];
	for (int i_50_ = 0; i_50_ < i_47_; i_50_++) {
	    anIntArray1586[i_50_] = Class67_Sub18.method1259(3) + 1;
	    int i_51_ = anIntArray1593[i_50_] = Class67_Sub18.method1259(2);
	    if (i_51_ != 0)
		anIntArray1585[i_50_] = Class67_Sub18.method1259(8);
	    i_51_ = 1 << i_51_;
	    int[] is = new int[i_51_];
	    anIntArrayArray1594[i_50_] = is;
	    for (int i_52_ = 0; i_52_ < i_51_; i_52_++)
		is[i_52_] = Class67_Sub18.method1259(8) - 1;
	}
	anInt1592 = Class67_Sub18.method1259(2) + 1;
	int i_53_ = Class67_Sub18.method1259(4);
	int i_54_ = 2;
	for (int i_55_ = 0; i_55_ < i_46_; i_55_++)
	    i_54_ += anIntArray1586[anIntArray1591[i_55_]];
	anIntArray1595 = new int[i_54_];
	anIntArray1595[0] = 0;
	anIntArray1595[1] = 1 << i_53_;
	i_54_ = 2;
	for (int i_56_ = 0; i_56_ < i_46_; i_56_++) {
	    int i_57_ = anIntArray1591[i_56_];
	    for (int i_58_ = 0; i_58_ < anIntArray1586[i_57_]; i_58_++)
		anIntArray1595[i_54_++] = Class67_Sub18.method1259(i_53_);
	}
	if (anIntArray1590 == null || anIntArray1590.length < i_54_) {
	    anIntArray1590 = new int[i_54_];
	    anIntArray1587 = new int[i_54_];
	    aBooleanArray1588 = new boolean[i_54_];
	}
    }
    
    public static int method1409(int[] arg0, int arg1) {
	int i = arg0[arg1];
	int i_59_ = -1;
	int i_60_ = 2147483647;
	for (int i_61_ = 0; i_61_ < arg1; i_61_++) {
	    int i_62_ = arg0[i_61_];
	    if (i_62_ > i && i_62_ < i_60_) {
		i_59_ = i_61_;
		i_60_ = i_62_;
	    }
	}
	return i_59_;
    }
}
