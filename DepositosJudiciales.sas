<?xml version="1.0" encoding="UTF-8"?>
<jasperReport xmlns="http://jasperreports.sourceforge.net/jasperreports" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd" name="DepositosJudiciales" pageWidth="595" pageHeight="842" columnWidth="555" leftMargin="20" rightMargin="20" topMargin="20" bottomMargin="20" uuid="317c6c86-ab1f-4790-a38d-7939ea4b629f">
	<property name="ireport.zoom" value="1.1566298682886091"/>
	<property name="ireport.x" value="0"/>
	<property name="ireport.y" value="378"/>
	<field name="nroCuenta" class="java.lang.String"/>
	<field name="nroExpediente" class="java.lang.String"/>
	<field name="nroCheque" class="java.lang.String"/>
	<field name="ordenJuzgado" class="java.lang.String"/>
	<field name="nominacion" class="java.lang.String"/>
	<field name="juicio" class="java.lang.String"/>
	<field name="pesos" class="java.lang.String"/>
	<field name="anio" class="java.lang.String"/>
	<field name="banco" class="java.lang.String"/>
	<field name="importe" class="java.lang.String"/>
	<detail>
		<band height="802">
			<staticText>
				<reportElement x="93" y="57" width="214" height="12" uuid="8ce18ed2-1c38-48f6-815d-ec21bdf81cd7"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<text><![CDATA[U.T.N FAC. REG. TUC.]]></text>
			</staticText>
			<staticText>
				<reportElement x="119" y="69" width="142" height="12" uuid="b249d1b7-f9b0-4bfc-a5a2-7d5c7a786df8"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<text><![CDATA[RIVADAVIA 1050 S. M. DE TUC.]]></text>
			</staticText>
			<textField>
				<reportElement x="29" y="81" width="314" height="24" uuid="8f68cb9d-0718-49e1-b857-2d89d2f48a06"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["                      "+$F{pesos}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="135" y="105" width="208" height="14" uuid="baf8656e-9690-4d26-9668-dbc76bc212fc"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{ordenJuzgado}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="84" y="119" width="261" height="13" uuid="6f8adbfb-22f2-4316-ab0c-f6162833dabc"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nominacion}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="31" y="133" width="313" height="26" uuid="efd85860-f6cf-4d1d-9900-77955ddffae8"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["                    "+$F{juicio}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="361" y="83" width="176" height="13" uuid="44d4753a-e987-4f93-b273-23f55a5bfa36"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nroCuenta}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="361" y="110" width="133" height="21" uuid="49eebfef-599c-40ff-bd0e-940b4c15768f"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nroExpediente}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="495" y="110" width="60" height="21" uuid="728c5d11-0634-454f-9e2b-1c949036e4d2"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{anio}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="405" y="137" width="70" height="20" uuid="65c11ff1-7d44-46ee-a0ea-2d07d6048a48"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nroCheque}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="361" y="137" width="70" height="20" uuid="317efddb-7c1f-4d51-90c7-7cb18456e05c"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{banco}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="437" y="38" width="100" height="20" uuid="042c22d2-62c3-42e8-9650-759c2a3ac7d5"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["$"+$F{importe}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="475" y="195" width="100" height="20" uuid="a5d2814e-c1cb-4305-884c-86e89d10a2d7"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["$"+$F{importe}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="28" y="394" width="313" height="26" uuid="84aa8cda-9d25-4fb6-ad8c-5688d6d18880"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["                    "+$F{juicio}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="472" y="456" width="100" height="20" uuid="02711efc-5ced-430b-a4cc-da4e41ece420"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["$"+$F{importe}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="358" y="371" width="133" height="21" uuid="3def449f-c441-4b14-ac0a-e8d738ca8f6a"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nroExpediente}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="358" y="398" width="70" height="20" uuid="4e44239f-03f5-4940-b134-474848abd011"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{banco}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="26" y="342" width="314" height="24" uuid="0029c35a-7b80-42bb-869d-c1c560174a80"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["                      "+$F{pesos}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="358" y="344" width="176" height="13" uuid="8343134e-8e17-4e43-a45f-a8b572f47043"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nroCuenta}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="132" y="366" width="208" height="14" uuid="8e9e9134-58c4-46df-9c60-35e56900035d"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{ordenJuzgado}]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement x="90" y="318" width="214" height="12" uuid="2105641f-197c-4df7-81d6-8681fbc4f269"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<text><![CDATA[U.T.N FAC. REG. TUC.]]></text>
			</staticText>
			<staticText>
				<reportElement x="116" y="330" width="142" height="12" uuid="2f9f6919-a550-4d41-a59b-43e405f7ed06"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<text><![CDATA[RIVADAVIA 1050 S. M. DE TUC.]]></text>
			</staticText>
			<textField>
				<reportElement x="81" y="380" width="261" height="13" uuid="fea06b06-f7f0-47c3-a431-4acaa442b843"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nominacion}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="434" y="301" width="100" height="20" uuid="af782e58-f232-4e9d-95ba-0ca4dd602979"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["$"+$F{importe}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="492" y="371" width="60" height="21" uuid="f6e6d16f-aab1-40c0-b545-f5dd4f63a156"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{anio}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="402" y="398" width="70" height="20" uuid="d3e6cbdd-87d8-430a-8e26-2c71d8101fb6"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nroCheque}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="28" y="656" width="313" height="26" uuid="447aed60-3729-4f2e-b963-196165f16e01"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["                    "+$F{juicio}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="472" y="718" width="100" height="20" uuid="9c161544-76c7-4f6d-bc88-5ffdd9c60161"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["$"+$F{importe}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="358" y="633" width="133" height="21" uuid="415a020c-6fdc-4c56-b9ce-01e08cbcb7ca"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nroExpediente}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="358" y="660" width="70" height="20" uuid="be3fbcee-e16c-4b8b-9ec0-c51b5263d46d"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{banco}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="26" y="604" width="314" height="24" uuid="0a5a0bee-1f27-4540-b97a-53b1f54ce793"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["                      "+$F{pesos}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="358" y="606" width="176" height="13" uuid="0fc6909d-ecbf-4799-a53f-fb39ad43d714"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nroCuenta}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="132" y="628" width="208" height="14" uuid="0ba3b141-3bb4-46fb-bd89-d404d1c24a59"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{ordenJuzgado}]]></textFieldExpression>
			</textField>
			<staticText>
				<reportElement x="90" y="580" width="214" height="12" uuid="50426aa8-8a56-4df2-b9a7-3f9d6739de47"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<text><![CDATA[U.T.N FAC. REG. TUC.]]></text>
			</staticText>
			<staticText>
				<reportElement x="116" y="592" width="142" height="12" uuid="d49390bf-0cac-4f49-8725-a580290cec0a"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<text><![CDATA[RIVADAVIA 1050 S. M. DE TUC.]]></text>
			</staticText>
			<textField>
				<reportElement x="81" y="642" width="261" height="13" uuid="72e602ab-97ef-45d7-9b27-cc8817f80f16"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nominacion}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="434" y="562" width="100" height="20" uuid="b21b8479-e5ec-4478-9019-8535cbfaa444"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA["$"+$F{importe}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="492" y="633" width="60" height="21" uuid="1e82e30c-5029-48d3-9337-83734b21211c"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{anio}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="402" y="660" width="70" height="20" uuid="1c2beaf9-4299-4ead-bef6-c6dec3194181"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{nroCheque}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="474" y="137" width="70" height="20" uuid="0ce8cc7b-3aba-403f-968b-2b8fa5c6ed49"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{importe}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="473" y="398" width="70" height="20" uuid="da0ed268-e3e5-48cc-9f62-ca008ad657d3"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{importe}]]></textFieldExpression>
			</textField>
			<textField>
				<reportElement x="472" y="660" width="70" height="20" uuid="b2b8dba6-6770-4e69-8417-b953958fffff"/>
				<textElement>
					<font fontName="Monospaced" size="9" isBold="true"/>
				</textElement>
				<textFieldExpression><![CDATA[$F{importe}]]></textFieldExpression>
			</textField>
		</band>
	</detail>
</jasperReport>
