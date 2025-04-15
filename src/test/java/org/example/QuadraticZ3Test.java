package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.*;

public class QuadraticZ3Test {

    @Test public void testCase1() { runTest(1, "1", "0", "-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); }
    @Test public void testCase2() { runTest(2, "1", "0", "-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); }
    @Test public void testCase3() { runTest(3, "1", "0", "-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); }
    @Test public void testCase4() { runTest(4, "1", "0", "-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); }
    @Test public void testCase5() { runTest(5, "1", "0", "-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); }
    @Test public void testCase6() { runTest(6, "1", "0", "-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); }
    @Test public void testCase7() { runTest(7, "1", "0", "-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); }
    @Test public void testCase8() { runTest(8, "1", "0", "-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); }
    @Test public void testCase9() { runTest(9, "1", "0", "-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); }
    @Test public void testCase10() { runTest(10, "1", "0", "-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"); }
    @Test public void testCase11() { runTest(11, "1", "0", "0"); }
    @Test public void testCase12() { runTest(12, "1", "0", "0"); }
    @Test public void testCase13() { runTest(13, "1", "0", "0"); }
    @Test public void testCase14() { runTest(14, "1", "0", "0"); }
    @Test public void testCase15() { runTest(15, "1", "0", "0"); }
    @Test public void testCase16() { runTest(16, "1", "0", "0"); }
    @Test public void testCase17() { runTest(17, "1", "0", "0"); }
    @Test public void testCase18() { runTest(18, "1", "0", "0"); }
    @Test public void testCase19() { runTest(19, "1", "0", "0"); }
    @Test public void testCase20() { runTest(20, "1", "0", "0"); }
    @Test public void testCase21() { runTest(21, "1", "0", "1"); }
    @Test public void testCase22() { runTest(22, "1", "0", "1"); }
    @Test public void testCase23() { runTest(23, "1", "0", "1"); }
    @Test public void testCase24() { runTest(24, "1", "0", "1"); }
    @Test public void testCase25() { runTest(25, "1", "0", "1"); }
    @Test public void testCase26() { runTest(26, "1", "0", "1"); }
    @Test public void testCase27() { runTest(27, "1", "0", "1"); }
    @Test public void testCase28() { runTest(28, "1", "0", "1"); }
    @Test public void testCase29() { runTest(29, "1", "0", "1"); }
    @Test public void testCase30() { runTest(30, "1", "0", "1"); }
    @Test public void testCase31() { runTest(31, "0", "0", "0"); }
    @Test public void testCase32() { runTest(32, "0", "0", "0"); }
    @Test public void testCase33() { runTest(33, "0", "0", "0"); }
    @Test public void testCase34() { runTest(34, "0", "0", "0"); }
    @Test public void testCase35() { runTest(35, "0", "0", "0"); }
    @Test public void testCase36() { runTest(36, "0", "0", "0"); }
    @Test public void testCase37() { runTest(37, "0", "0", "0"); }
    @Test public void testCase38() { runTest(38, "0", "0", "0"); }
    @Test public void testCase39() { runTest(39, "0", "0", "0"); }
    @Test public void testCase40() { runTest(40, "0", "0", "0"); }
    @Test public void testCase41() { runTest(41, "-1", "-1", "-1"); }
    @Test public void testCase42() { runTest(42, "-1", "-1", "0"); }
    @Test public void testCase43() { runTest(43, "-1", "-1", "1"); }
    @Test public void testCase44() { runTest(44, "-1", "-1", "1e-100"); }
    @Test public void testCase45() { runTest(45, "-1", "-1", "1e100"); }
    @Test public void testCase46() { runTest(46, "-1", "-1", "-1e-100"); }
    @Test public void testCase47() { runTest(47, "-1", "-1", "-1e100"); }
    @Test public void testCase48() { runTest(48, "-1", "0", "-1"); }
    @Test public void testCase49() { runTest(49, "-1", "0", "0"); }
    @Test public void testCase50() { runTest(50, "-1", "0", "1"); }
    @Test public void testCase51() { runTest(51, "-1", "0", "1e-100"); }
    @Test public void testCase52() { runTest(52, "-1", "0", "1e100"); }
    @Test public void testCase53() { runTest(53, "-1", "0", "-1e-100"); }
    @Test public void testCase54() { runTest(54, "-1", "0", "-1e100"); }
    @Test public void testCase55() { runTest(55, "-1", "1", "-1"); }
    @Test public void testCase56() { runTest(56, "-1", "1", "0"); }
    @Test public void testCase57() { runTest(57, "-1", "1", "1"); }
    @Test public void testCase58() { runTest(58, "-1", "1", "1e-100"); }
    @Test public void testCase59() { runTest(59, "-1", "1", "1e100"); }
    @Test public void testCase60() { runTest(60, "-1", "1", "-1e-100"); }
    @Test public void testCase61() { runTest(61, "-1", "1", "-1e100"); }
    @Test public void testCase62() { runTest(62, "-1", "1e-100", "-1"); }
    @Test public void testCase63() { runTest(63, "-1", "1e-100", "0"); }
    @Test public void testCase64() { runTest(64, "-1", "1e-100", "1"); }
    @Test public void testCase65() { runTest(65, "-1", "1e-100", "1e-100"); }
    @Test public void testCase66() { runTest(66, "-1", "1e-100", "1e100"); }
    @Test public void testCase67() { runTest(67, "-1", "1e-100", "-1e-100"); }
    @Test public void testCase68() { runTest(68, "-1", "1e-100", "-1e100"); }
    @Test public void testCase69() { runTest(69, "-1", "1e100", "-1"); }
    @Test public void testCase70() { runTest(70, "-1", "1e100", "0"); }
    @Test public void testCase71() { runTest(71, "-1", "1e100", "1"); }
    @Test public void testCase72() { runTest(72, "-1", "1e100", "1e-100"); }
    @Test public void testCase73() { runTest(73, "-1", "1e100", "1e100"); }
    @Test public void testCase74() { runTest(74, "-1", "1e100", "-1e-100"); }
    @Test public void testCase75() { runTest(75, "-1", "1e100", "-1e100"); }
    @Test public void testCase76() { runTest(76, "-1", "-1e-100", "-1"); }
    @Test public void testCase77() { runTest(77, "-1", "-1e-100", "0"); }
    @Test public void testCase78() { runTest(78, "-1", "-1e-100", "1"); }
    @Test public void testCase79() { runTest(79, "-1", "-1e-100", "1e-100"); }
    @Test public void testCase80() { runTest(80, "-1", "-1e-100", "1e100"); }
    @Test public void testCase81() { runTest(81, "-1", "-1e-100", "-1e-100"); }
    @Test public void testCase82() { runTest(82, "-1", "-1e-100", "-1e100"); }
    @Test public void testCase83() { runTest(83, "-1", "-1e100", "-1"); }
    @Test public void testCase84() { runTest(84, "-1", "-1e100", "0"); }
    @Test public void testCase85() { runTest(85, "-1", "-1e100", "1"); }
    @Test public void testCase86() { runTest(86, "-1", "-1e100", "1e-100"); }
    @Test public void testCase87() { runTest(87, "-1", "-1e100", "1e100"); }
    @Test public void testCase88() { runTest(88, "-1", "-1e100", "-1e-100"); }
    @Test public void testCase89() { runTest(89, "-1", "-1e100", "-1e100"); }
    @Test public void testCase90() { runTest(90, "0", "-1", "-1"); }
    @Test public void testCase91() { runTest(91, "0", "-1", "0"); }
    @Test public void testCase92() { runTest(92, "0", "-1", "1"); }
    @Test public void testCase93() { runTest(93, "0", "-1", "1e-100"); }
    @Test public void testCase94() { runTest(94, "0", "-1", "1e100"); }
    @Test public void testCase95() { runTest(95, "0", "-1", "-1e-100"); }
    @Test public void testCase96() { runTest(96, "0", "-1", "-1e100"); }
    @Test public void testCase97() { runTest(97, "0", "0", "-1"); }
    @Test public void testCase98() { runTest(98, "0", "0", "0"); }
    @Test public void testCase99() { runTest(99, "0", "0", "1"); }
    @Test public void testCase100() { runTest(100, "0", "0", "1e-100"); }
    @Test public void testCase101() { runTest(101, "0", "0", "1e100"); }
    @Test public void testCase102() { runTest(102, "0", "0", "-1e-100"); }
    @Test public void testCase103() { runTest(103, "0", "0", "-1e100"); }
    @Test public void testCase104() { runTest(104, "0", "1", "-1"); }
    @Test public void testCase105() { runTest(105, "0", "1", "0"); }
    @Test public void testCase106() { runTest(106, "0", "1", "1"); }
    @Test public void testCase107() { runTest(107, "0", "1", "1e-100"); }
    @Test public void testCase108() { runTest(108, "0", "1", "1e100"); }
    @Test public void testCase109() { runTest(109, "0", "1", "-1e-100"); }
    @Test public void testCase110() { runTest(110, "0", "1", "-1e100"); }
    @Test public void testCase111() { runTest(111, "0", "1e-100", "-1"); }
    @Test public void testCase112() { runTest(112, "0", "1e-100", "0"); }
    @Test public void testCase113() { runTest(113, "0", "1e-100", "1"); }
    @Test public void testCase114() { runTest(114, "0", "1e-100", "1e-100"); }
    @Test public void testCase115() { runTest(115, "0", "1e-100", "1e100"); }
    @Test public void testCase116() { runTest(116, "0", "1e-100", "-1e-100"); }
    @Test public void testCase117() { runTest(117, "0", "1e-100", "-1e100"); }
    @Test public void testCase118() { runTest(118, "0", "1e100", "-1"); }
    @Test public void testCase119() { runTest(119, "0", "1e100", "0"); }
    @Test public void testCase120() { runTest(120, "0", "1e100", "1"); }
    @Test public void testCase121() { runTest(121, "0", "1e100", "1e-100"); }
    @Test public void testCase122() { runTest(122, "0", "1e100", "1e100"); }
    @Test public void testCase123() { runTest(123, "0", "1e100", "-1e-100"); }
    @Test public void testCase124() { runTest(124, "0", "1e100", "-1e100"); }
    @Test public void testCase125() { runTest(125, "0", "-1e-100", "-1"); }
    @Test public void testCase126() { runTest(126, "0", "-1e-100", "0"); }
    @Test public void testCase127() { runTest(127, "0", "-1e-100", "1"); }
    @Test public void testCase128() { runTest(128, "0", "-1e-100", "1e-100"); }
    @Test public void testCase129() { runTest(129, "0", "-1e-100", "1e100"); }
    @Test public void testCase130() { runTest(130, "0", "-1e-100", "-1e-100"); }
    @Test public void testCase131() { runTest(131, "0", "-1e-100", "-1e100"); }
    @Test public void testCase132() { runTest(132, "0", "-1e100", "-1"); }
    @Test public void testCase133() { runTest(133, "0", "-1e100", "0"); }
    @Test public void testCase134() { runTest(134, "0", "-1e100", "1"); }
    @Test public void testCase135() { runTest(135, "0", "-1e100", "1e-100"); }
    @Test public void testCase136() { runTest(136, "0", "-1e100", "1e100"); }
    @Test public void testCase137() { runTest(137, "0", "-1e100", "-1e-100"); }
    @Test public void testCase138() { runTest(138, "0", "-1e100", "-1e100"); }
    @Test public void testCase139() { runTest(139, "1", "-1", "-1"); }
    @Test public void testCase140() { runTest(140, "1", "-1", "0"); }
    @Test public void testCase141() { runTest(141, "1", "-1", "1"); }
    @Test public void testCase142() { runTest(142, "1", "-1", "1e-100"); }
    @Test public void testCase143() { runTest(143, "1", "-1", "1e100"); }
    @Test public void testCase144() { runTest(144, "1", "-1", "-1e-100"); }
    @Test public void testCase145() { runTest(145, "1", "-1", "-1e100"); }
    @Test public void testCase146() { runTest(146, "1", "0", "-1"); }
    @Test public void testCase147() { runTest(147, "1", "0", "0"); }
    @Test public void testCase148() { runTest(148, "1", "0", "1"); }
    @Test public void testCase149() { runTest(149, "1", "0", "1e-100"); }
    @Test public void testCase150() { runTest(150, "1", "0", "1e100"); }
    @Test public void testCase151() { runTest(151, "1", "0", "-1e-100"); }
    @Test public void testCase152() { runTest(152, "1", "0", "-1e100"); }
    @Test public void testCase153() { runTest(153, "1", "1", "-1"); }
    @Test public void testCase154() { runTest(154, "1", "1", "0"); }
    @Test public void testCase155() { runTest(155, "1", "1", "1"); }
    @Test public void testCase156() { runTest(156, "1", "1", "1e-100"); }
    @Test public void testCase157() { runTest(157, "1", "1", "1e100"); }
    @Test public void testCase158() { runTest(158, "1", "1", "-1e-100"); }
    @Test public void testCase159() { runTest(159, "1", "1", "-1e100"); }
    @Test public void testCase160() { runTest(160, "1", "1e-100", "-1"); }
    @Test public void testCase161() { runTest(161, "1", "1e-100", "0"); }
    @Test public void testCase162() { runTest(162, "1", "1e-100", "1"); }
    @Test public void testCase163() { runTest(163, "1", "1e-100", "1e-100"); }
    @Test public void testCase164() { runTest(164, "1", "1e-100", "1e100"); }
    @Test public void testCase165() { runTest(165, "1", "1e-100", "-1e-100"); }
    @Test public void testCase166() { runTest(166, "1", "1e-100", "-1e100"); }
    @Test public void testCase167() { runTest(167, "1", "1e100", "-1"); }
    @Test public void testCase168() { runTest(168, "1", "1e100", "0"); }
    @Test public void testCase169() { runTest(169, "1", "1e100", "1"); }
    @Test public void testCase170() { runTest(170, "1", "1e100", "1e-100"); }
    @Test public void testCase171() { runTest(171, "1", "1e100", "1e100"); }
    @Test public void testCase172() { runTest(172, "1", "1e100", "-1e-100"); }
    @Test public void testCase173() { runTest(173, "1", "1e100", "-1e100"); }
    @Test public void testCase174() { runTest(174, "1", "-1e-100", "-1"); }
    @Test public void testCase175() { runTest(175, "1", "-1e-100", "0"); }
    @Test public void testCase176() { runTest(176, "1", "-1e-100", "1"); }
    @Test public void testCase177() { runTest(177, "1", "-1e-100", "1e-100"); }
    @Test public void testCase178() { runTest(178, "1", "-1e-100", "1e100"); }
    @Test public void testCase179() { runTest(179, "1", "-1e-100", "-1e-100"); }
    @Test public void testCase180() { runTest(180, "1", "-1e-100", "-1e100"); }
    @Test public void testCase181() { runTest(181, "1", "-1e100", "-1"); }
    @Test public void testCase182() { runTest(182, "1", "-1e100", "0"); }
    @Test public void testCase183() { runTest(183, "1", "-1e100", "1"); }
    @Test public void testCase184() { runTest(184, "1", "-1e100", "1e-100"); }
    @Test public void testCase185() { runTest(185, "1", "-1e100", "1e100"); }
    @Test public void testCase186() { runTest(186, "1", "-1e100", "-1e-100"); }
    @Test public void testCase187() { runTest(187, "1", "-1e100", "-1e100"); }
    @Test public void testCase188() { runTest(188, "1e-100", "-1", "-1"); }
    @Test public void testCase189() { runTest(189, "1e-100", "-1", "0"); }
    @Test public void testCase190() { runTest(190, "1e-100", "-1", "1"); }
    @Test public void testCase191() { runTest(191, "1e-100", "-1", "1e-100"); }
    @Test public void testCase192() { runTest(192, "1e-100", "-1", "1e100"); }
    @Test public void testCase193() { runTest(193, "1e-100", "-1", "-1e-100"); }
    @Test public void testCase194() { runTest(194, "1e-100", "-1", "-1e100"); }
    @Test public void testCase195() { runTest(195, "1e-100", "0", "-1"); }
    @Test public void testCase196() { runTest(196, "1e-100", "0", "0"); }
    @Test public void testCase197() { runTest(197, "1e-100", "0", "1"); }
    @Test public void testCase198() { runTest(198, "1e-100", "0", "1e-100"); }
    @Test public void testCase199() { runTest(199, "1e-100", "0", "1e100"); }
    @Test public void testCase200() { runTest(200, "1e-100", "0", "-1e-100"); }
    @Test public void testCase201() { runTest(201, "1e-100", "0", "-1e100"); }
    @Test public void testCase202() { runTest(202, "1e-100", "1", "-1"); }
    @Test public void testCase203() { runTest(203, "1e-100", "1", "0"); }
    @Test public void testCase204() { runTest(204, "1e-100", "1", "1"); }
    @Test public void testCase205() { runTest(205, "1e-100", "1", "1e-100"); }
    @Test public void testCase206() { runTest(206, "1e-100", "1", "1e100"); }
    @Test public void testCase207() { runTest(207, "1e-100", "1", "-1e-100"); }
    @Test public void testCase208() { runTest(208, "1e-100", "1", "-1e100"); }
    @Test public void testCase209() { runTest(209, "1e-100", "1e-100", "-1"); }
    @Test public void testCase210() { runTest(210, "1e-100", "1e-100", "0"); }
    @Test public void testCase211() { runTest(211, "1e-100", "1e-100", "1"); }
    @Test public void testCase212() { runTest(212, "1e-100", "1e-100", "1e-100"); }
    @Test public void testCase213() { runTest(213, "1e-100", "1e-100", "1e100"); }
    @Test public void testCase214() { runTest(214, "1e-100", "1e-100", "-1e-100"); }
    @Test public void testCase215() { runTest(215, "1e-100", "1e-100", "-1e100"); }
    @Test public void testCase216() { runTest(216, "1e-100", "1e100", "-1"); }
    @Test public void testCase217() { runTest(217, "1e-100", "1e100", "0"); }
    @Test public void testCase218() { runTest(218, "1e-100", "1e100", "1"); }
    @Test public void testCase219() { runTest(219, "1e-100", "1e100", "1e-100"); }
    @Test public void testCase220() { runTest(220, "1e-100", "1e100", "1e100"); }
    @Test public void testCase221() { runTest(221, "1e-100", "1e100", "-1e-100"); }
    @Test public void testCase222() { runTest(222, "1e-100", "1e100", "-1e100"); }
    @Test public void testCase223() { runTest(223, "1e-100", "-1e-100", "-1"); }
    @Test public void testCase224() { runTest(224, "1e-100", "-1e-100", "0"); }
    @Test public void testCase225() { runTest(225, "1e-100", "-1e-100", "1"); }
    @Test public void testCase226() { runTest(226, "1e-100", "-1e-100", "1e-100"); }
    @Test public void testCase227() { runTest(227, "1e-100", "-1e-100", "1e100"); }
    @Test public void testCase228() { runTest(228, "1e-100", "-1e-100", "-1e-100"); }
    @Test public void testCase229() { runTest(229, "1e-100", "-1e-100", "-1e100"); }
    @Test public void testCase230() { runTest(230, "1e-100", "-1e100", "-1"); }
    @Test public void testCase231() { runTest(231, "1e-100", "-1e100", "0"); }
    @Test public void testCase232() { runTest(232, "1e-100", "-1e100", "1"); }
    @Test public void testCase233() { runTest(233, "1e-100", "-1e100", "1e-100"); }
    @Test public void testCase234() { runTest(234, "1e-100", "-1e100", "1e100"); }
    @Test public void testCase235() { runTest(235, "1e-100", "-1e100", "-1e-100"); }
    @Test public void testCase236() { runTest(236, "1e-100", "-1e100", "-1e100"); }
    @Test public void testCase237() { runTest(237, "1e100", "-1", "-1"); }
    @Test public void testCase238() { runTest(238, "1e100", "-1", "0"); }
    @Test public void testCase239() { runTest(239, "1e100", "-1", "1"); }
    @Test public void testCase240() { runTest(240, "1e100", "-1", "1e-100"); }
    @Test public void testCase241() { runTest(241, "1e100", "-1", "1e100"); }
    @Test public void testCase242() { runTest(242, "1e100", "-1", "-1e-100"); }
    @Test public void testCase243() { runTest(243, "1e100", "-1", "-1e100"); }
    @Test public void testCase244() { runTest(244, "1e100", "0", "-1"); }
    @Test public void testCase245() { runTest(245, "1e100", "0", "0"); }
    @Test public void testCase246() { runTest(246, "1e100", "0", "1"); }
    @Test public void testCase247() { runTest(247, "1e100", "0", "1e-100"); }
    @Test public void testCase248() { runTest(248, "1e100", "0", "1e100"); }
    @Test public void testCase249() { runTest(249, "1e100", "0", "-1e-100"); }
    @Test public void testCase250() { runTest(250, "1e100", "0", "-1e100"); }
    @Test public void testCase251() { runTest(251, "1e100", "1", "-1"); }
    @Test public void testCase252() { runTest(252, "1e100", "1", "0"); }
    @Test public void testCase253() { runTest(253, "1e100", "1", "1"); }
    @Test public void testCase254() { runTest(254, "1e100", "1", "1e-100"); }
    @Test public void testCase255() { runTest(255, "1e100", "1", "1e100"); }
    @Test public void testCase256() { runTest(256, "1e100", "1", "-1e-100"); }
    @Test public void testCase257() { runTest(257, "1e100", "1", "-1e100"); }
    @Test public void testCase258() { runTest(258, "1e100", "1e-100", "-1"); }
    @Test public void testCase259() { runTest(259, "1e100", "1e-100", "0"); }
    @Test public void testCase260() { runTest(260, "1e100", "1e-100", "1"); }
    @Test public void testCase261() { runTest(261, "1e100", "1e-100", "1e-100"); }
    @Test public void testCase262() { runTest(262, "1e100", "1e-100", "1e100"); }
    @Test public void testCase263() { runTest(263, "1e100", "1e-100", "-1e-100"); }
    @Test public void testCase264() { runTest(264, "1e100", "1e-100", "-1e100"); }
    @Test public void testCase265() { runTest(265, "1e100", "1e100", "-1"); }
    @Test public void testCase266() { runTest(266, "1e100", "1e100", "0"); }
    @Test public void testCase267() { runTest(267, "1e100", "1e100", "1"); }
    @Test public void testCase268() { runTest(268, "1e100", "1e100", "1e-100"); }
    @Test public void testCase269() { runTest(269, "1e100", "1e100", "1e100"); }
    @Test public void testCase270() { runTest(270, "1e100", "1e100", "-1e-100"); }
    @Test public void testCase271() { runTest(271, "1e100", "1e100", "-1e100"); }
    @Test public void testCase272() { runTest(272, "1e100", "-1e-100", "-1"); }
    @Test public void testCase273() { runTest(273, "1e100", "-1e-100", "0"); }
    @Test public void testCase274() { runTest(274, "1e100", "-1e-100", "1"); }
    @Test public void testCase275() { runTest(275, "1e100", "-1e-100", "1e-100"); }
    @Test public void testCase276() { runTest(276, "1e100", "-1e-100", "1e100"); }
    @Test public void testCase277() { runTest(277, "1e100", "-1e-100", "-1e-100"); }
    @Test public void testCase278() { runTest(278, "1e100", "-1e-100", "-1e100"); }
    @Test public void testCase279() { runTest(279, "1e100", "-1e100", "-1"); }
    @Test public void testCase280() { runTest(280, "1e100", "-1e100", "0"); }
    @Test public void testCase281() { runTest(281, "1e100", "-1e100", "1"); }
    @Test public void testCase282() { runTest(282, "1e100", "-1e100", "1e-100"); }
    @Test public void testCase283() { runTest(283, "1e100", "-1e100", "1e100"); }
    @Test public void testCase284() { runTest(284, "1e100", "-1e100", "-1e-100"); }
    @Test public void testCase285() { runTest(285, "1e100", "-1e100", "-1e100"); }
    @Test public void testCase286() { runTest(286, "-1e-100", "-1", "-1"); }
    @Test public void testCase287() { runTest(287, "-1e-100", "-1", "0"); }
    @Test public void testCase288() { runTest(288, "-1e-100", "-1", "1"); }
    @Test public void testCase289() { runTest(289, "-1e-100", "-1", "1e-100"); }
    @Test public void testCase290() { runTest(290, "-1e-100", "-1", "1e100"); }
    @Test public void testCase291() { runTest(291, "-1e-100", "-1", "-1e-100"); }
    @Test public void testCase292() { runTest(292, "-1e-100", "-1", "-1e100"); }
    @Test public void testCase293() { runTest(293, "-1e-100", "0", "-1"); }
    @Test public void testCase294() { runTest(294, "-1e-100", "0", "0"); }
    @Test public void testCase295() { runTest(295, "-1e-100", "0", "1"); }
    @Test public void testCase296() { runTest(296, "-1e-100", "0", "1e-100"); }
    @Test public void testCase297() { runTest(297, "-1e-100", "0", "1e100"); }
    @Test public void testCase298() { runTest(298, "-1e-100", "0", "-1e-100"); }
    @Test public void testCase299() { runTest(299, "-1e-100", "0", "-1e100"); }
    @Test public void testCase300() { runTest(300, "-1e-100", "1", "-1"); }
    @Test public void testCase301() { runTest(301, "-1e-100", "1", "0"); }
    @Test public void testCase302() { runTest(302, "-1e-100", "1", "1"); }
    @Test public void testCase303() { runTest(303, "-1e-100", "1", "1e-100"); }
    @Test public void testCase304() { runTest(304, "-1e-100", "1", "1e100"); }
    @Test public void testCase305() { runTest(305, "-1e-100", "1", "-1e-100"); }
    @Test public void testCase306() { runTest(306, "-1e-100", "1", "-1e100"); }
    @Test public void testCase307() { runTest(307, "-1e-100", "1e-100", "-1"); }
    @Test public void testCase308() { runTest(308, "-1e-100", "1e-100", "0"); }
    @Test public void testCase309() { runTest(309, "-1e-100", "1e-100", "1"); }
    @Test public void testCase310() { runTest(310, "-1e-100", "1e-100", "1e-100"); }
    @Test public void testCase311() { runTest(311, "-1e-100", "1e-100", "1e100"); }
    @Test public void testCase312() { runTest(312, "-1e-100", "1e-100", "-1e-100"); }
    @Test public void testCase313() { runTest(313, "-1e-100", "1e-100", "-1e100"); }
    @Test public void testCase314() { runTest(314, "-1e-100", "1e100", "-1"); }
    @Test public void testCase315() { runTest(315, "-1e-100", "1e100", "0"); }
    @Test public void testCase316() { runTest(316, "-1e-100", "1e100", "1"); }
    @Test public void testCase317() { runTest(317, "-1e-100", "1e100", "1e-100"); }
    @Test public void testCase318() { runTest(318, "-1e-100", "1e100", "1e100"); }
    @Test public void testCase319() { runTest(319, "-1e-100", "1e100", "-1e-100"); }
    @Test public void testCase320() { runTest(320, "-1e-100", "1e100", "-1e100"); }
    @Test public void testCase321() { runTest(321, "-1e-100", "-1e-100", "-1"); }
    @Test public void testCase322() { runTest(322, "-1e-100", "-1e-100", "0"); }
    @Test public void testCase323() { runTest(323, "-1e-100", "-1e-100", "1"); }
    @Test public void testCase324() { runTest(324, "-1e-100", "-1e-100", "1e-100"); }
    @Test public void testCase325() { runTest(325, "-1e-100", "-1e-100", "1e100"); }
    @Test public void testCase326() { runTest(326, "-1e-100", "-1e-100", "-1e-100"); }
    @Test public void testCase327() { runTest(327, "-1e-100", "-1e-100", "-1e100"); }
    @Test public void testCase328() { runTest(328, "-1e-100", "-1e100", "-1"); }
    @Test public void testCase329() { runTest(329, "-1e-100", "-1e100", "0"); }
    @Test public void testCase330() { runTest(330, "-1e-100", "-1e100", "1"); }
    @Test public void testCase331() { runTest(331, "-1e-100", "-1e100", "1e-100"); }
    @Test public void testCase332() { runTest(332, "-1e-100", "-1e100", "1e100"); }
    @Test public void testCase333() { runTest(333, "-1e-100", "-1e100", "-1e-100"); }
    @Test public void testCase334() { runTest(334, "-1e-100", "-1e100", "-1e100"); }
    @Test public void testCase335() { runTest(335, "-1e100", "-1", "-1"); }
    @Test public void testCase336() { runTest(336, "-1e100", "-1", "0"); }
    @Test public void testCase337() { runTest(337, "-1e100", "-1", "1"); }
    @Test public void testCase338() { runTest(338, "-1e100", "-1", "1e-100"); }
    @Test public void testCase339() { runTest(339, "-1e100", "-1", "1e100"); }
    @Test public void testCase340() { runTest(340, "-1e100", "-1", "-1e-100"); }
    @Test public void testCase341() { runTest(341, "-1e100", "-1", "-1e100"); }
    @Test public void testCase342() { runTest(342, "-1e100", "0", "-1"); }
    @Test public void testCase343() { runTest(343, "-1e100", "0", "0"); }
    @Test public void testCase344() { runTest(344, "-1e100", "0", "1"); }
    @Test public void testCase345() { runTest(345, "-1e100", "0", "1e-100"); }
    @Test public void testCase346() { runTest(346, "-1e100", "0", "1e100"); }
    @Test public void testCase347() { runTest(347, "-1e100", "0", "-1e-100"); }
    @Test public void testCase348() { runTest(348, "-1e100", "0", "-1e100"); }
    @Test public void testCase349() { runTest(349, "-1e100", "1", "-1"); }
    @Test public void testCase350() { runTest(350, "-1e100", "1", "0"); }
    @Test public void testCase351() { runTest(351, "-1e100", "1", "1"); }
    @Test public void testCase352() { runTest(352, "-1e100", "1", "1e-100"); }
    @Test public void testCase353() { runTest(353, "-1e100", "1", "1e100"); }
    @Test public void testCase354() { runTest(354, "-1e100", "1", "-1e-100"); }
    @Test public void testCase355() { runTest(355, "-1e100", "1", "-1e100"); }
    @Test public void testCase356() { runTest(356, "-1e100", "1e-100", "-1"); }
    @Test public void testCase357() { runTest(357, "-1e100", "1e-100", "0"); }
    @Test public void testCase358() { runTest(358, "-1e100", "1e-100", "1"); }
    @Test public void testCase359() { runTest(359, "-1e100", "1e-100", "1e-100"); }
    @Test public void testCase360() { runTest(360, "-1e100", "1e-100", "1e100"); }
    @Test public void testCase361() { runTest(361, "-1e100", "1e-100", "-1e-100"); }
    @Test public void testCase362() { runTest(362, "-1e100", "1e-100", "-1e100"); }
    @Test public void testCase363() { runTest(363, "-1e100", "1e100", "-1"); }
    @Test public void testCase364() { runTest(364, "-1e100", "1e100", "0"); }
    @Test public void testCase365() { runTest(365, "-1e100", "1e100", "1"); }
    @Test public void testCase366() { runTest(366, "-1e100", "1e100", "1e-100"); }
    @Test public void testCase367() { runTest(367, "-1e100", "1e100", "1e100"); }
    @Test public void testCase368() { runTest(368, "-1e100", "1e100", "-1e-100"); }
    @Test public void testCase369() { runTest(369, "-1e100", "1e100", "-1e100"); }
    @Test public void testCase370() { runTest(370, "-1e100", "-1e-100", "-1"); }
    @Test public void testCase371() { runTest(371, "-1e100", "-1e-100", "0"); }
    @Test public void testCase372() { runTest(372, "-1e100", "-1e-100", "1"); }
    @Test public void testCase373() { runTest(373, "-1e100", "-1e-100", "1e-100"); }
    @Test public void testCase374() { runTest(374, "-1e100", "-1e-100", "1e100"); }
    @Test public void testCase375() { runTest(375, "-1e100", "-1e-100", "-1e-100"); }
    @Test public void testCase376() { runTest(376, "-1e100", "-1e-100", "-1e100"); }
    @Test public void testCase377() { runTest(377, "-1e100", "-1e100", "-1"); }
    @Test public void testCase378() { runTest(378, "-1e100", "-1e100", "0"); }
    @Test public void testCase379() { runTest(379, "-1e100", "-1e100", "1"); }
    @Test public void testCase380() { runTest(380, "-1e100", "-1e100", "1e-100"); }
    @Test public void testCase381() { runTest(381, "-1e100", "-1e100", "1e100"); }
    @Test public void testCase382() { runTest(382, "-1e100", "-1e100", "-1e-100"); }
    @Test public void testCase383() { runTest(383, "-1e100", "-1e100", "-1e100"); }

    private String simulateMainInput(String a, String b, String c) {
        String input = a + "\n" + b + "\n" + c + "\nn\n";
        InputStream sysInBackup = System.in;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream sysOutBackup = System.out;

        try {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            System.setOut(new PrintStream(output));
            org.example.Quadratic.main(new String[0]);
        } catch (Exception e) {
            String message = "Exception: " + (e.getMessage() != null ? e.getMessage() : e.toString());
            try { output.write(message.getBytes()); }
            catch (IOException ioException) { ioException.printStackTrace(); }
        } finally {
            System.setIn(sysInBackup);
            System.setOut(sysOutBackup);
        }
        return output.toString();
    }

    private boolean isExtreme(String val) {
        return val.equals("1e-100") || val.equals("1e100");
    }

    private boolean isZero(String val) {
        return val.equals("0");
    }

    private double parse(String val) {
        return Double.parseDouble(val);
    }

    private void runTest(int index, String aStr, String bStr, String cStr) {
        String output = simulateMainInput(aStr, bStr, cStr);

        output = output.replace("Welcome to org.example.Quadratic Equation Solver.", "").trim();
        output = output.replace("A quadratic equation can be written in the form ax^2 + bx + c = 0, where x is an unknown, a, b, and c are constants, and a is not zero.", "").trim();
        output = output.replace("Given values for a, b, and c, this program will produce the two roots of the equation. Both real and complex roots are supported, but not complex coefficients.", "").trim();
        output = output.replace("Press Ctrl+C to quit at any time.", "").trim();
        output = output.replace("Enter a value for 'a':", "").trim();
        output = output.replace("Enter a value for 'b':", "").trim();
        output = output.replace("Enter a value for 'c':", "").trim();
        output = output.replace("Would you like to try again? [y/n]", "").trim();
        output = output.replace("Thank you for using org.example.Quadratic Equation Solver!", "").trim();
        output = output.replaceAll("[\\r\\n]+", " ").trim();

        double a = parse(aStr), b = parse(bStr), c = parse(cStr);
        String result = "FAIL";

        try {
            if (isZero(aStr)) {
                assertTrue(output.contains("'a' cannot be zero"));
                result = "PASS";
            } else if (isExtreme(aStr) || isExtreme(bStr) || isExtreme(cStr)) {
                if (output.contains("too small") || output.contains("too large") || output.contains("Failed to find")) {
                    assertTrue(true);
                    result = "PASS";
                }
            } else {
                double discriminant = b * b - 4 * a * c;
                if (discriminant > 0) {
                    assertTrue(output.contains("x1 ="));
                    assertTrue(output.contains("x2 ="));
                    assertFalse(output.contains("i"));
                    result = "PASS";
                } else if (discriminant == 0) {
                    assertTrue(output.contains("x1 ="));
                    assertFalse(output.contains("x2 ="));
                    assertFalse(output.contains("i"));
                    result = "PASS";
                } else {
                    assertTrue(output.contains("x1 ="));
                    assertTrue(output.contains("x2 ="));
                    assertTrue(output.contains("+") && output.contains("-") && output.contains("i"));
                    result = "PASS";
                }
            }
        } catch (AssertionError e) {
            assertFalse(false);
            System.out.println("Case " + index + ": FAIL " + output);
            org.junit.Assert.fail("Assertion failed in Case " + index + ": " + output);
            return;
        }

        System.out.println("Case " + index + ": " + result + " " + output);
    }
}
