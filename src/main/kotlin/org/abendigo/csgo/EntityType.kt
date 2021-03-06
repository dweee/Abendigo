package org.abendigo.csgo

import org.jire.arrowhead.get

enum class EntityType(val id: Int, val weapon: Boolean = false, val grenade: Boolean = false) {

	NextBotCombatCharacter(0),
	CAK47(1, weapon = true),
	CBaseAnimating(2),
	CBaseAnimatingOverlay(3),
	CBaseAttributableItem(4),
	CBaseButton(5),
	CBaseCombatCharacter(6),
	CBaseCombatWeapon(7),
	CBaseCSGrenade(8, grenade = true),
	CBaseCSGrenadeProjectile(9, grenade = true),
	CBaseDoor(10),
	CBaseEntity(11),
	CBaseFlex(12),
	CBaseGrenade(13, grenade = true),
	CBaseParticleEntity(14),
	CBasePlayer(15),
	CBasePropDoor(16),
	CBaseTeamObjectiveResource(17),
	CBaseTempEntity(18),
	CBaseToggle(19),
	CBaseTrigger(20),
	CBaseViewModel(21),
	CBaseVPhysicsTrigger(22),
	CBaseWeaponWorldModel(23),
	CBeam(24),
	CBeamSpotlight(25),
	CBoneFollower(26),
	CBreakableProp(27),
	CBreakableSurface(28),
	CC4(29),
	CCascadeLight(30),
	CChicken(31),
	CColorCorrection(32),
	CColorCorrectionVolume(33),
	CCSGameRulesProxy(34),
	CCSPlayer(35),
	CCSPlayerResource(36),
	CCSRagdoll(37),
	CCSTeam(38),
	CDEagle(39, weapon = true),
	CDecoyGrenade(40, grenade = true),
	CDecoyProjectile(41, grenade = true),
	CDynamicLight(42),
	CDynamicProp(43),
	CEconEntity(44),
	CEmbers(45),
	CEntityDissolve(46),
	CEntityFlame(47),
	CEntityFreezing(48),
	CEntityParticleTrail(49),
	CEnvAmbientLight(50),
	CEnvDetailController(51),
	CEnvDOFController(52),
	CEnvParticleScript(53),
	CEnvProjectedTexture(54),
	CEnvQuadraticBeam(55),
	CEnvScreenEffect(56),
	CEnvScreenOverlay(57),
	CEnvTonemapController(58),
	CEnvWind(59),
	CFireCrackerBlast(60),
	CFireSmoke(61),
	CFireTrail(62),
	CFish(63),
	CFlashbang(64, grenade = true),
	CFogController(65),
	CFootstepControl(66),
	CFunc_Dust(67),
	CFunc_LOD(68),
	CFuncAreaPortalWindow(69),
	CFuncBrush(70),
	CFuncConveyor(71),
	CFuncLadder(72),
	CFuncMonitor(73),
	CFuncMoveLinear(74),
	CFuncOccluder(75),
	CFuncReflectiveGlass(76),
	CFuncRotating(77),
	CFuncSmokeVolume(78),
	CFuncTrackTrain(79),
	CGameRulesProxy(80),
	CHandleTest(81),
	CHEGrenade(82, grenade = true),
	CHostage(83),
	CHostageCarriableProp(84),
	CIncendiaryGrenade(85, grenade = true),
	CInferno(86, grenade = true),
	CInfoLadderDismount(87),
	CInfoOverlayAccessor(88),
	CKnife(89, weapon = true),
	CKnifeGG(90, weapon = true),
	CLightGlow(91),
	CMaterialModifyControl(92),
	CMolotovGrenade(93, grenade = true),
	CMolotovProjectile(94, grenade = true),
	CMovieDisplay(95),
	CParticleFire(96),
	CParticlePerformanceMonitor(97),
	CParticleSystem(98),
	CPhysBox(99),
	CPhysBoxMultiplayer(100),
	CPhysicsProp(101),
	CPhysicsPropMultiplayer(102),
	CPhysMagnet(103),
	CPlantedC4(104),
	CPlasma(105),
	CPlayerResource(106),
	CPointCamera(107),
	CPointCommentaryNode(108),
	CPoseController(109),
	CPostProcessController(110),
	CPrecipitation(111),
	CPrecipitationBlocker(112),
	CPredictedViewModel(113),
	CProp_Hallucination(114),
	CPropDoorRotating(115),
	CPropJeep(116),
	CPropVehicleDriveable(117),
	CRagdollManager(118),
	CRagdollProp(119),
	CRagdollPropAttached(120),
	CRopeKeyframe(121),
	CSCAR17(122, weapon = true),
	CSceneEntity(123),
	CShadowControl(124),
	CSlideshowDisplay(125),
	CSmokeGrenade(126, grenade = true),
	CSmokeGrenadeProjectile(127, grenade = true),
	CSmokeStack(128),
	CSpatialEntity(129),
	CSpotlightEnd(130),
	CSprite(131),
	CSpriteOriented(132),
	CSpriteTrail(133),
	CStatueProp(134),
	CSteamJet(135),
	CSun(136),
	CSunlightShadowControl(137),
	CTeam(138),
	CTeamplayRoundBasedRulesProxy(139),
	CTEArmorRicochet(140),
	CTEBaseBeam(141),
	CTEBeamEntPoint(142),
	CTEBeamEnts(143),
	CTEBeamFollow(144),
	CTEBeamLaser(145),
	CTEBeamPoints(146),
	CTEBeamRing(147),
	CTEBeamRingPoint(148),
	CTEBeamSpline(149),
	CTEBloodSprite(150),
	CTEBloodStream(151),
	CTEBreakModel(152),
	CTEBSPDecal(153),
	CTEBubbles(154),
	CTEBubbleTrail(155),
	CTEClientProjectile(156),
	CTEDecal(157),
	CTEDust(158),
	CTEDynamicLight(159),
	CTEEffectDispatch(160),
	CTEEnergySplash(161),
	CTEExplosion(162),
	CTEFireBullets(163),
	CTEFizz(164),
	CTEFootprintDecal(165),
	CTEFoundryHelpers(166),
	CTEGaussExplosion(167),
	CTEGlowSprite(168),
	CTEImpact(169),
	CTEKillPlayerAttachments(170),
	CTELargeFunnel(171),
	CTEMetalSparks(172),
	CTEMuzzleFlash(173),
	CTEParticleSystem(174),
	CTEPhysicsProp(175),
	CTEPlantBomb(176),
	CTEPlayerAnimEvent(177),
	CTEPlayerDecal(178),
	CTEProjectedDecal(179),
	CTERadioIcon(180),
	CTEShatterSurface(181),
	CTEShowLine(182),
	CTesla(183),
	CTESmoke(184),
	CTESparks(185),
	CTESprite(186),
	CTESpriteSpray(187),
	CTest_ProxyToggle_Networkable(188),
	CTestTraceline(189),
	CTEWorldDecal(190),
	CTriggerPlayerMovement(191),
	CTriggerSoundOperator(192),
	CVGuiScreen(193),
	CVoteController(194),
	CWaterBullet(195),
	CWaterLODControl(196),
	CWeaponAug(197, weapon = true),
	CWeaponAWP(198, weapon = true),
	CWeaponBizon(199, weapon = true),
	CWeaponCSBase(200, weapon = true),
	CWeaponCSBaseGun(201, weapon = true),
	CWeaponCycler(202, weapon = true),
	CWeaponElite(203, weapon = true),
	CWeaponFamas(204, weapon = true),
	CWeaponFiveSeven(205, weapon = true),
	CWeaponG3SG1(206, weapon = true),
	CWeaponGalil(207, weapon = true),
	CWeaponGalilAR(208, weapon = true),
	CWeaponGlock(209, weapon = true),
	CWeaponHKP2000(210, weapon = true),
	CWeaponM249(211, weapon = true),
	CWeaponM3(212, weapon = true),
	CWeaponM4A1(213, weapon = true),
	CWeaponMAC10(214, weapon = true),
	CWeaponMag7(215, weapon = true),
	CWeaponMP5Navy(216, weapon = true),
	CWeaponMP7(217, weapon = true),
	CWeaponMP9(218, weapon = true),
	CWeaponNegev(219, weapon = true),
	CWeaponNOVA(220, weapon = true),
	CWeaponP228(221, weapon = true),
	CWeaponP250(222, weapon = true),
	CWeaponP90(223, weapon = true),
	CWeaponSawedoff(224, weapon = true),
	CWeaponSCAR20(225, weapon = true),
	CWeaponScout(226, weapon = true),
	CWeaponSG550(227, weapon = true),
	CWeaponSG552(228, weapon = true),
	CWeaponSG556(229, weapon = true),
	CWeaponSSG08(230, weapon = true),
	CWeaponTaser(231, weapon = true),
	CWeaponTec9(232, weapon = true),
	CWeaponTMP(233, weapon = true),
	CWeaponUMP45(234, weapon = true),
	CWeaponUSP(235, weapon = true),
	CWeaponXM1014(236, weapon = true),
	CWorld(237),
	DustTrail(238),
	MovieExplosion(239),
	ParticleSmokeGrenade(240, grenade = true),
	RocketTrail(241),
	SmokeTrail(242),
	SporeExplosion(243),
	SporeTrail(244);

	companion object {

		private val cachedValues = values()

		fun byID(id: Int) = cachedValues.firstOrNull { it.id == id }

		fun byEntityAddress(address: Int): EntityType? {
			if (address <= 0) return null

			val vtRead = csgo.read(address + 0x8, 4) ?: return null
			val vt = vtRead.getInt(0)
			if (vt <= 0) return null

			val fnRead = csgo.read(vt + 2 * 0x4, 4) ?: return null
			val fn = fnRead.getInt(0)
			if (fn <= 0) return null

			val clsRead = csgo.read(fn + 0x1, 4) ?: return null
			val cls = clsRead.getInt(0)
			if (cls <= 0) return null

			// val clsn: Int = csgo[cls + 8]

			val clsIDRead = csgo.read(cls + 20, 4) ?: return null
			val clsID = clsIDRead.getInt(0)
			if (clsID < 0 || clsID > SporeTrail.id) return null

			return byID(clsID)
		}

	}

}