<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="snippet.Snippet"%>
<%@ taglib uri="http://java.fckeditor.net" prefix="FCK"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean"
	prefix="bean"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic"
	prefix="logic"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles"
	prefix="tiles"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-template"
	prefix="template"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-nested"
	prefix="nested"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title><%=Snippet.BBS_NAME%>-վ��</title>
        <base href="<%=basePath%>">
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
			<link href="css/style_1.css" rel="stylesheet" type="text/css">
	</head>

	<body><center>
		<jsp:include page="/top.jsp"></jsp:include>
		
		<div class="box message" align="left" style="width: 1003px">
		<h1>
				<%=Snippet.BBS_NAME%>վ�棡
		</h1>
		<p>
			<a href="web/bbs/bbsLaw.jsp#one">һ�����������ȷ�Ϻͽ���</a><br>
<a href="web/bbs/bbsLaw.jsp#two">����Ȩ��������</a><br>
<a href="web/bbs/bbsLaw.jsp#three">������������֪ʶ��Ȩ</a><br>
<a href="web/bbs/bbsLaw.jsp#four">�ġ���������</a><br>
<a href="web/bbs/bbsLaw.jsp#five">�塢����������޸ĺͷ����޶�</a><br>
<a href="web/bbs/bbsLaw.jsp#six">����ͨ��</a><br>
<a href="web/bbs/bbsLaw.jsp#seven">�ߡ����ɹ�Ͻ</a><br>
</p>
<h2>���ݣ�</h2>

    JF��һ�������й������������˵��ۺ�������վ������ϣ�����ܹ���JF�Ͻ�����ѧϰ��������<br>

<p id="one">һ�����������ȷ�Ϻͽ���</p>
    JF�ĸ�����ӷ��������Ȩ������Ȩ��������֪(����)���缼�����޹�˾��JF�ṩ�ķ�����ȫ�����䷢�����³̡���������Ͳ��������ϸ�ִ�С���Ա������ȫͬ�����з���������ע����򣬲��ܳ�ΪJF����ʽע���Ա���ܸ�JF�ṩ�ĸ�ȫ��ķ���

<p id="two">����Ȩ��������</p>

JF��Ȩ������<br>
<p>
1�����ػ�Ա��˽�ƶ�<br>
     ���ػ�Ա������˽�����ϻ�Ա��˽��ȫ��JF��һ��������ߣ�JF���ṫ�����༭��͸¶��Ա��ע�����ϣ����Ƿ������������<br>
    (1) �����л����񹲺͹����Ұ�ȫ�������������ŵ�Ҫ�󼰸�����Ӧ�ķ��ɳ���Ҫ��<br>
    (2) ά��JF���̱�����Ȩ������Ȩ�档<br>
    (3) �ڽ�������½���ά����Ա���ˡ�����������������ڵİ�ȫ��<br>
    (4) ����Υ��JF�йع涨��<br>
    JF����������Աʹ����������ʸ��Ȩ��������֤������Ա�ʸ����Ϊ��Ա�������и�����˽��<br>
</p>
<p>2��ά��JF��վ�������������ṩ�������</p>

<p>3����Ա����<br>
    JF�Ի�Ա�Ĺ������ݹ��ҷ��ɡ��ط����ɺ͹��ʷ��ɵȵı�׼��ͬʱ��Ա����̳�ϵ���Ϊ����JF��̳��Ϊ׼���Լ����<br>
</p>
<p>4���Ի�Ա��Ϣ�Ĵ洢������<br>
    JF���Ի�Ա��������Ϣ��ɾ���򴢴�ʧ���κη��ɸ���JF���ж���Ա����Ϊ�Ƿ����JF���������Ҫ��;���ı���Ȩ���������ԱΥ���˷�������Ĺ涨��JF��Ȩѡ���ʵ��Ĵ�������ֱ��ȡ����Ա�ʸ��Ȩ����<br>
</p>

��Ա��Ȩ������<br>
<p>
1����Ա������ѭ��<br>
(1)�й����������BBS����ط��档<br>
(2)ʹ������������Ƿ���;��<br>
(3)�����Ż�����������<br>
(4)��������ʹ��������������Э�顢�涨������͹�����<br>
</p>
<p>
ͬʱ��Ա��ŵ��<br>
(1)�������κηǷ��ġ�ɧ���Եġ��������˵ġ������Եġ������Եġ��˺��Եġ�ӹ�׵ģ��������Ϣ���ϣ�<br>
(2)�������κν������˹��ɷ�����Ϊ�����ϣ�<br>
(3)�������κβ����ϵ��ط��桢���ҷ��ɺ͹��ʷ��ɵ����ϣ�<br>
(4)δ�����ɶ��Ƿ�������������ϵͳ�ǽ�ֹ�ģ�<br>
(5)���ɹ涨����������<br>
(6)����̳���۵�ʱ�����JF��̳��Ϊ׼��<br>
(7)�������ܺͰ�����ì�ܾ��׵ĵ��ڣ����������ж�����������ʹͶ��Ȩ����������ס�<br>

     ����Ա����Ϊ�����������ᵽ�ķ������JF�����������жϣ�����������ж�����Ա����Լ������ϵ���Ϊ�е��������Ρ���Ա����JF��ɢ���ʹ���������ɫ�������Υ�����ҷ��ɵ���Ϣ��JF����ȫ���˾�����ص��ж���<br>
</p>
<p>2�����������������Լ���Ҫ�ԣ���Աͬ�⣺<br>
(1)���ϸ���ע�����ϣ����ϼ�ʱ���꾡��׼ȷ��Ҫ��<br>
(2)�����䱸�����������豸�� �������˵��ԡ����ƽ�����������ر�����װ�á�<br>
(3)���и�������������֧������˷����йصĵ绰���á� ������á�<br>
</p>
<p>3����Ա���ʺš�����Ͱ�ȫ�� <br>
    ��Աһ��ע��ɹ�����ΪJF�ĺϷ���Ա�����õ�һ������ͻ�Ա������Ա���Լ����ʺš�����Ͱ�ȫ����ȫ�����Ρ�<br>
    ��Աͬ���������κηǷ�ʹ�ø��û��ʺŻ����������û���������������ͨ��JF��JF���յ���ȷ��email�����û�����֤������󣬿��Զ��û�������и��ġ��û������������ȷ��email��ַ���Լ��������롣<br>
    JF�����Ա���ڸ������룬���ⲻ��Ҫ������й©�����⣬ÿ����Ա��Ҫ�������Ա�����е����л���¼���ȫ��<br>
</p>
<p>4����Ա���������������Ϣ<br>
    ��Ա�����Ƿ�������Ϣ�м����������ϻ������߻����˲���Ƹ�ȣ���JF����ѷ�����չʾ���ǵĲ�Ʒ���κ���������������������������������ҵ�����������������йص�������ֻ������Ӧ�Ļ�Ա�͹��������֮�䷢����JF���е��κ����Σ�JFû������Ϊ���������۸��κ�һ���ֵ����Ρ���Ա��Ҫ�Դ˳е�ȫ�����Ρ�<br>
</p>
<p>5����Աͬ�Ᵽ�Ϻ�ά��JFȫ���Ա�����档<br>
</p>
<p id="three">������������֪ʶ��Ȩ</p>
1����Ա���Լ�����������ӵ�а�Ȩ��<br>
2��JF�����з�����JF������ӵ��ʹ��Ȩ��<br>
3�����ת��������ע�����ߺͳ�����
4�����������Ȩ���ף�JF��Ȩ�ھ��׽��ǰɾ���о��׵�����<br>
5��ת��JF�����±���õ����������߻���JF����Ȩ�����������ߺͳ�����<br>

<p id="four">�ġ���������</p>
      JF���κ�ֱ�ӡ���ӡ�żȻ�����⼰������𺦲����������Σ���Щ�𺦿������ԣ����˵���Ϊ����Ա���ļ��Ľ����������Ͻ��н��ף��Ƿ�ʹ�����������û����͵���Ϣ�����䶯����Щ��Ϊ���п��ܻᵼ��JF��������������JF������������𺦵Ŀ����ԡ�<br>
JF�Ա����ṩ���г���������ط��ɳе����Ρ�

<p id="five">�塢����������޸ĺͷ����޶�</p>
      JF��Ȩ�ڱ�Ҫʱ�޸ķ������JF��������һ�������䶯����������Ҫҳ������ʾ�޸����ݡ������ͬ�����Ķ������ݣ���Ա������ָ���������������ۡ�Ͷ�߻�������ȡ��������񣬵���������ǰ����ִ�����еķ������JF������ʱ�޸Ļ��жϷ��������֪���û���Ȩ����JF��ʹ�޸Ļ��жϷ����Ȩ����������û������������<br>
�����漰�г�����ĸĶ�JF�е���ط������Ρ�<br>

<p id="six">����ͨ��</p>
      JF���з�����Ա��ͨ�涼��ͨ����Ҫҳ��Ĺ��������ʼ�������������޸ġ�����������������Ҫ�¼���ͨ�涼���Դ���ʽ���С�<br>
����JF��ϵͳͨ��email�û�������գ�����һ���ṩ�˶����ܣ����ڲ������˶���emailͨ�棬�û���ȨͶ�ߡ�<br>

<p id="seven">�ߡ����ɹ�Ͻ</p>
      �����������Ҫ���л����񹲺͹��ķ��ɽ�����һ�£���Ա��JFһ��ͬ������й���Ժ��Ͻ���緢��JF�����������л����񹲺͹�������ִ�ʱ���Է���Ϊ׼��ͬʱ��Щ�����ȫ�����ɹ涨���½��ͣ����������������ɱ��ֶԻ�Ա��������Ч����Ӱ�졣<br>

      ���޹�˾���������������ս���Ȩ��  <br>

</div>
		

		<jsp:include page="/foot.jsp"></jsp:include>
		</center>
	</body>

</html>
