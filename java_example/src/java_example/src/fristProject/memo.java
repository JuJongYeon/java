package fristProject;
//각지역에서 잡을 수 있는 모든 물고기에 대한 사전적의미를 담은 클래스
//Map을 이용하여 물고기이름을 입력하면 그 물고기에 해당하는 의미를 출력해줌
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class memo {
	
	
	public void dogam() {
		Map<String,String> map = new HashMap<String, String>();
		while(true) {
		Scanner sr= new Scanner(System.in);
		System.out.println("서해안의 물고기 : |송사리|해파리|참돔|참치|고래|");
		System.out.println("계곡의 물고기  :  |가재|쏘가리|꺽지|금강모치|");
		System.out.println("아마존의 물고기 : |파쿠|피라냐|피라루쿠|악어|");
		System.out.println("어떤 물고기에 대해 알고싶으신가요?");
		System.out.println("물고기를 선택해주세요!");
		map.put("송사리", "몸길이 약 5cm이다.\r몸높이는 높고 뒷지느러미가 시작하는 부위부터 급격히 낮아진다.\r몸은 가늘고 길며 옆으로 납작하다.\r머리는 약간 위아래로 납작하고 윗부분은 조금 편평하며 눈은 크다.\r주둥이는 끝이 둔하며, 그 끝에 있는 입은 작고 비스듬히 위로 향해 있다.\r양 턱에는 매우 작고 검은 점들이 촘촘히 있다.\r쇄골에 이빨이 없고 헛아가미도 없다. \r\n" + 
				"\r\n" + 
				"몸의 뒷부분에 있는 등지느러미는 길이가 짧다.\r수컷의 등지느러미는 가장자리가 갈라져 있다.\r뒷지느러미는 등지느러미보다 약간 앞에서 시작하며 길이가 길다.\r꼬리지느러미 끝의 가장자리는 직선형이다.\r몸빛깔은 담회갈색으로 배쪽은 더 밝은색이다.\r머리의 뒤쪽에서 등지느러미 기부(origin:기관 또는 부속기관이 몸통과 연결되는 부위 중 가장 앞쪽 끝 지점)까지의 등 가운데선을 따라서 어두운 색인 세로줄이 있다. \r\n" + 
				"\r\n" + 
				"급한 흐름에는 살지 않으며 수심이 얕은 호수·늪·연못·논도랑에서 산다.\r표층에서 무리를 지어 헤엄친다. 온도·염도·수질·오탁·산소함량 등 환경 변화에 대한 내성이 강하다.\r플랑크톤을 주식으로 하지만 잡식성이다.\r산란기는 4월 하순에서 10월 사이로 연 2∼3회 산란하나 수온 18∼30℃에서는 1년 내내 산란한다.\r주로 아침에 산란하며 암컷이 알을 달고 다니다가 물풀에 붙인다.\r한국·일본·타이완·중국 등지에 분포한다.\r\n");
		map.put("해파리", " 해파리는 분류학상 자포동물문의 해파리강과 유즐동물문(Ctenophora)의 빗해파리류로 크게 나뉜다.\r그런데 빗해파리류는 수면 가까이에 떠다니는 습성을 가져 일반적으로 해파리라 하면 산호나 말미잘처럼 강장이 있으면서 자세포를 가지고 있는 자포동물문 해파리강에 속하는 종들만을 일컫는다.\r이들은 삿갓같이 생긴 몸체 가장 자리에 촉수가 나 있으며 몸체는 바깥쪽과 안쪽 두 개의 층으로 나뉘어져 있다.\r\n" + 
				"해파리 - 거대한 동물성 플랑크톤 \r\n" + 
				"\r\n" + 
				"치어(稚魚)는 알에서 깬 직후 표층에 부상 유영하다가 성장해가면서 표층생활에서 연안의 얕은 해조류가 많은 곳으로 이동하며 치어기는 수심 10m보다 얕은 곳에 머문다. 10㎝ 미만은 연안을 떠나서 성장함에 따라 깊은 곳으로 이동한다.\r성어가 되면 야간에는 분산하고 중·표층으로 부상 그다지 이동하지 않지만 주간에는 밀집 침하하고 활발하게 움직인다.\r특히 아침·저녁의 이동은 현저하다.\r\n" + 
				"\r\n" + 
				"황해의 경우 수온이 내려가기 시작하는 가을 겨울에 걸쳐 발해만이나 황해 북부의 각 연안으로부터 남하를 시작해서 1월에는 북위 35°선에 달하며 그 해역에서부터 남부해역에 걸쳐 3월경까지 월동한다.\r그뒤 수온의 상승과 함께 다시 북상한다고 알려져 있다.\r\n" + 
				"\r\n" + 
				"먹이는 치어일 때는 동물플랑크톤이지만 성장함에 따라 게·새우·곤쟁이 및 갑각류 유생을 즐겨 먹는다.\r미성어기가 되면 초기에는 대형 새우류와 게류를 잡아먹다가 몸길이 15㎝ 이상이 되면 주로 까나리를 잡아먹는 육식성으로 변한다.\r성어기가 되면 동물·소형어류·게·새우류 등을 닥치는대로 잡아먹는다.\r\n");
		map.put("참돔", "색채가 아름답고, 모양새가 잘 짜여져 있다고 하여 '참(眞)' 자를 붙여 예로부터 참돔, 참도미, 진도미어(眞道味魚)로 불렸다.\r\n" + 
				"\r\n" + 
				"《자산어보》에는 강항어(强項魚)로 기록되어 형태, 특성, 잡는 방법 등에 관해 서술되어 있고,\r《전어지》에는 독미어(禿尾魚), 조선시대 《경상도지리지》에는 도음어(都音魚)로 기록되어 있다.\r지방과 성장 단계에 따라서도 다른 이름을 가지고 있어서, 강원도에서는 도미(道尾, 道味),돔, 돗도미라 하고,\r어린 참돔을 전남에서는 상사리, 제주도에서는 배들래기, 경남에서는 고다이라고 부른다.\r또한 경남에서는 일본어로 붉은 돔이라는 뜻의 아까다이라고 부르기도 한다.\r\n" + 
				"\r\n" + 
				"최대 몸길이 100cm 내외로 암컷보다 수컷의 성장이 빠르다.\r몸은 타원형이고 옆으로 납작하며, 몸은 빗 모양의 직사각형 비늘로 덮여 있다.\r몸 등쪽은 붉은색을 띠며 배쪽은 노란색 또는 흰색을 띤다.\r측선 주위로 푸른빛의 작은 반점이 흩어져 있다.\r어릴 때에는 선홍색 바탕에 5줄의 짙은 붉은색의 띠를 갖고 있으나 성장함에 따라 없어지며,\r나이를 먹으면 검은빛이 짙어진다.\r\n" + 
				"\r\n" + 
				"수심 10∼200m의 바닥 기복이 심한 암초 지역에 주로 서식하며,\r제주도 남방 해역에서 겨울잠을 자고 봄이 되면 서해안과 중국 연안으로 이동한다.\r잡식성으로서 새우나 갯지렁이, 어류 등을 주로 먹는다.\r산란기는 4∼6월이며, 산란에 적합한 수온은 15∼17℃이다.\r산란기 동안에는 살이 오르고 무리를 지어 다니며, 밤에는 20~40m 이상의 수심에서 헤엄쳐 다닌다.\r\n");
		map.put("참치", "흔히 다랭이 또는 참치라고도 한다.다랑어는 그 종류가 많은데,\r현재 많이 잡고 있는 종류로는 참다랑어·날개다랑어·눈다랑어·황다랑어·가다랑어 등이 있다.\r다랑어는 분포 수역에 따라 열대성 다랑어, 온대성 다랑어로 나뉘어지는데\r일반적으로 열대성 다랑어에는 가다랑어, 눈다랑어, 황다랑어가 속하고, 온대성 다랑어에는 참다랑어, 날개다랑어 등이 속한다. 그 외 연안성 다랑어류가 있다.\r\n" + 
				"\r\n" + 
				"참다랑어는 온대성으로 전 세계에 3종이 분포하는데 우리나라, 일본, 대만, 미국, 멕시코 해역에 분포하는 태평양참다랑어,\r대서양에 분포하는 대서양참다랑어, 남반구에 분포하는 남방참다랑어가 있다.\r참다랑어는 다랑어 중에서 가장 크며 태평양의 것은 체장은 최고 3m, 체중은 555㎏에 달한다.\r몸은 방추형이며 머리 부분은 원추형이다.\r몸의 등쪽은 짙은 청색을 띄며 몸의 중앙과 배쪽은 은회색 바탕에 여러개의 폭이 좁은 가느다란 흰색 가로띠와 둥근 무늬가 나타난다.\r\n" + 
				"\r\n" + 
				"등지느러미는 2개이고, 제1등지느러미에는 제2등지느러미에 비하여 길이가 훨씬 길며, 가슴지느러미는 짧아서 끝이 제2등지느러미 시작부분에 미치지 못한다.\r\n" + 
				"\r\n" + 
				"동중국해와 동해에서 산란하며 성장하면서 태평양을 횡단하여 동부 태평양으로 회유하며 다시 산란장으로 되돌아온다.\r우리나라 연안에서는 근해 대형선망과 정치망 등에 잡힌다.\r살이 붉고 아름다우며 횟감으로 가장 좋다.\r\n" + 
				"\r\n" + 
				"날개다랑어는 온대성이며 가슴지느러미가 아주 발달한 종류로, 3대양의 온대수역에서 주로 어획된다.\r살이 흰색이어서 서양에서는 바다닭고기라고 하여 선호한다.\r눈다랭이는 길이가 2m 정도로 다랑어류 중에서 눈이 가장 크다.\r열대성으로 3대양의 열대 수역에서 어획되며 살은 연한 붉은색으로 초밥용으로 이용된다.\r\n" + 
				"\r\n" + 
				"황다랑어는 제1지느러미를 제외한 지느러미가 황색을 띠는 것이 특징이다.\r눈다랑어와 함께 열대성으로 3대양의 열대 수역에 분포하며 살은 아름다운 복숭아빛으로 횟감이나 초밥용으로 좋다.\r\n" + 
				"\r\n" + 
				"가다랑어는 몸 빛깔은 등쪽이 짙은 청자색을 띠고, 배 부분은 은백색 바탕에 4∼6개의 검은색 세로띠가 있는 것이 특징이다.\r열대성으로 3대양의 열대 해역에 주로 분포한다.\r최근 전 세계 어획량이 250만 톤을 넘어서면서 어종별 어획량에서 2번째로 많은 양을 기록하기도 하였다.\r주로 통조림으로 가공되어 소비되고 있다.\r이밖에도 연안성 다랑어류가 있으며 우리나라 연해에는 백다랑어·점다랑어 등이 있다.\r\n" + 
				"\r\n" + 
				"다랑어는 선사시대의 패총에서도 각종 물고기의 뼈와 함께 출토된 것으로 미루어 그 어획이 일찍부터 이루어졌음을 알 수 있다.\r그러나 우리나라 연해에는 많이 분포하지 않으며, 1957년 이후 우리나라 원양어업의 주요 어획종이다.\r\n");
		map.put("고래", ".포유강(哺乳綱) 고래목에 속하는 동물의 총칭. 4~5 m 정도를 기준으로 해서 그"
				+ "보다 작은 종은 돌고래, 큰 종은 고래라고 한다.\r그러나 흰돌고래와 범고래는 돌고래지만 4~5 m가 넘는데, 사실 이는 흰돌고래와 범고래의 학명이 저런 기준이 확립되기 전에 만들어진 것이라 그렇다.\r범고래가 범돌고래로 불리지 않는 이유. 영어로도 'Killer Whale'라고 불린다.\r흰돌고래는 이름에 돌고래가 들어가나 사실 고래에 속하기 때문에 요새는 흰돌고래가 아니라 '벨루가'라 불리기도 한다.\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"몸은 머리·몸통·꼬리·지느러미의 4부로 구분되고, 체형은 방추형(紡錘形:원통형에 양끝이 원뿔 모양)이다.\r일반적으로 지느러미가 발달되어 있으며, 등지느러미에 강한 가시를 가진 것도 있다.\r수컷의 배지느러미에는 막대 모양의 교미기(交尾器)가 있고, 교미 때 정액(精液)의 수송로가 된다.\r꼬리지느러미는 위아래가 비대칭이며 윗입쪽이 길다.\r\n" + 
				"\r\n" + 
				"몸의 표면은 방패비늘[楯鱗]로 덮여 있어 만지면 꺼끌꺼끌하다.\r입은 몸의 아랫면에 있고, 그 앞쪽에 콧구멍과 입을 연결하는 비구구(鼻口溝)가 있는 것도 있다.\r눈은 머리의 좌우에 있고, 그 뒤쪽에 5∼7쌍의 아가미구멍[?孔]이 있다.\r눈의 바로 뒤에는 숨을 쉴 때 물을 들이마시는 기관인 분수공(噴水孔)이 있다.\r\n" + 
				"\r\n" + 
				"골격은 모두 연골로 되어 있고, 이는 잘 발달되어 있어 분류학상의 중요점이 되고 있다.\r장관(腸管)은 언뜻 보면 짧게 보이지만, 내부가 나선 모양으로 되어 있어 실제로는 길다.\r혈관계는 혈액이 혈관 속으로만 흐르는 폐쇄혈관계(閉鎖血管系)다.\r심장은 1심방 1심실이고, 심장구(心臟球)로 되어 있다.\r\n");
		map.put("가재", "새우와 게의 중간형으로 대하와 비슷하다.\r몸길이 약 50mm, 이마뿔을 제외한 갑각길이 29∼32mm이다.\r한자어로는 석해(石蟹)라 한다.\r머리가슴은 등배쪽으로 약간 납작한 원기둥모양이고, 배도 등배쪽으로 납작하다.\r갑각 윗면은 매끈한 편이나, 양쪽 옆면에는 작은 알갱이모양 돌기가 빽빽하다.\r\n" + 
				"\r\n" + 
				"이마뿔은 넓고 양 옆과 앞가장자리는 융기선을 이루어 테를 두른 것처럼 보인다.\r갑각의 목홈은 뚜렷하다.\r총 5쌍의 다리를 갖는다.\r제1 가슴다리는 크고 억세며, 길이는 이마뿔을 제외한 갑각길이의 1.5배에 가깝다.\r\n" + 
				"\r\n" + 
				"제2 가슴다리는 작은 집게를 갖는데, 다리를 펴면 끝이 제1 가슴다리 집게의 밑둥에 이른다.\r제3 가슴다리는 제2 가슴다리보다 가늘고 길다.\r몸빛깔은 붉은빛을 띤 갈색이다.\r알에서 부화한 새끼는 암컷의 배에 안겨 보호받는다.\r\n");
		map.put("쏘가리", "몸통은 옆으로 납작하고, 머리는 옆으로 약간 납작하다.\r아래턱은 위턱보다 길다.\r턱뼈, 보습뼈(두개골의 맨 앞에 있는 한 개로 된 뼈) 또는 입천장뼈(입천장 앞쪽에 있는 한 쌍의 납작한 뼈)에 이빨이 있다.\r등지느러미는 머리 뒷부분부터 시작한다.\r꼬리지느러미의 뒷가장자리는 둥글다.\r몸통 옆면에는 황갈색 바탕에 둥근 암갈색 표범무늬가 있다.\r등지느러미, 뒷지느러미 또는 꼬리지느러미에는 작은 흑갈색 점이 열을 지어 배열되어 있다.\r\n" + 
				"\r\n" + 
				"쏘가리는 물이 맑고 큰 자갈이나 바위가 많으며 물의 속도가 빠른 큰 강의 중류 지역에 산다.\r작은 물고기나 새우 종류를 잡아먹는다.\t알을 낳는 시기는 3~7월이며, 물의 속도가 빠른 자갈 바닥에 알을 낳는다.\r\n");
		map.put("꺽지", "몸길이는 15~20cm이다.\r몸과 머리는 좌우로 납작한 형태이며 옆에서 보면 방추형이다.\r몸에 비하여 머리가 크고 눈은 머리의 위쪽에 있다.\r입은 크고 끝이 뾰족하며 위턱이 아래턱보다 약간 길다.\r등지느러미와 뒷지느러미의 뒷부분은 끝이 둥글고 길다.\r꼬리지느러미는 테두리가 둥글다.\r\n" + 
				"\r\n" + 
				"몸은 연한 녹색 빛이 도는 갈색이며 몸 옆에는 7~8개의 검은색의 가는 가로무늬가 있고,\r아가미덮개에는 청색의 둥근 반점이 있다.\r지느러미는 연한 황갈색이다.\r\n" + 
				"\r\n" + 
				"하천 중·상류의 물이 맑고 자갈이 많은 하천에 서식하며, 낮에는 돌 틈에 숨어있다가 밤에 주로 활동한다.\r산란시기는 5~6월이며 수컷은 새끼들이 부화하여 일정 크기까지 자랄 때까지 알을 지키는 부성애 습성을 가지고 있다.\r육식성으로 작은 물고기와 갑각류, 물에 사는 곤충을 잡아먹는다.\r\n" + 
				"\r\n" + 
				"한국에서는 거의 모든 하천 수계에서 볼 수 있으며, 한국에만 분포하는 한국고유종이다.  \r\n");
		map.put("금강모치", "금강산 계곡에서 처음 발견되어 금강모치라는 이름이 붙었는데 버들쟁이·산버들치·산피리·버드랑치·버들피리·버드쟁이·용버들쟁이·청산피래미·청피리 등으로도 불린다.\r북한에서는‘금강뽀돌개’라고 한다. \r\n" + 
				"\r\n" + 
				"몸길이 10cm 내외로 크기가 작은 소형종이며 날씬하다.\r몸은 원통형에 가깝지만 옆으로 조금 납작하다.\r머리는 보통으로 눈은 머리의 양 옆 가운데보다 약간 앞쪽에 있고 등쪽에 붙는다.\r콧구멍은 2개로 앞뒤가 서로 가깝고 눈의 앞끝에 가깝다.\r주둥이 끝이 뾰족하고 아래턱이 위턱보다 조금 짧다. \r\n" + 
				"\r\n" + 
				"아가미구멍은 양쪽 다 아가미뚜껑 바로 뒤에 뚫려 있고 넓다.\r아가미갈퀴는 작은 돌기처럼 생겼으며 짧고 그 수가 적다.\r입수염은 없다.\r등지느러미는 배지느러미보다 뒤에 붙으며 삼각형 모양으로 바깥 가장자리는 거의 직선이다.\r뒷지느러미의 모양과 크기는 등지느러미와 비슷하고 바깥 가장자리는 밖으로 둥글다.\r꼬리지느러미는 깊이 갈라지고 끝이 날카롭다. \r\n" + 
				"\r\n" + 
				"비늘은 비교적 크고 측선(옆줄)의 비늘수는 58∼66개이다. 측선은 완전하다.\r몸빛깔은 등쪽이 황갈색으로 짙고 배쪽은 은백색을 띤다.\r살아 있을 때는 몸의 옆면 가운데와 배쪽의 옆면에 2줄의 주황색 세로띠가 있다.\r가슴지느러미가 등에 붙는 첫 부분은 주황색이고, 등지느러미가 등에 붙는 첫 부분은 흰색인데 바로 뒤에 검은 반점이 있다.\r\n" + 
				"\r\n" + 
				"하천의 최상류 1급수 지역, 물이 맑고 찬 계곡, 바닥에 자갈이 많이 깔려 있는 계곡, 산소가 풍부하고 물이 맑은 수계에서 서식한다.\r물의 중간층을 헤엄치면서 물속에 사는 작은 곤충이나 갑각류를 잡아먹는다.\r산란기는 4∼5월이며 부화 후 1년만에 약 5cm 크기로 자란다.\r\n" + 
				"\r\n" + 
				"금강에서 압록강 사이의 황해로 유입되는 하천과 동해로 유입되는 외금강의 하천에 분포하는 한반도 고유종이다.\r강원도, 충청북도 단양군, 경상북도 봉화군의 산간지방에 분포하며 한강 최상류, 금강의 무주구천동에서도 서식한다.\r무주구천동산 금강모치는 1996년 4월 1일 특정야생동물로 지정되었다.\r\n");
		map.put("파쿠", "Red pacu 또는 콜로소마(Colossoma)로 불리기도 한다.\rPacu로 통칭되는 유사종들이 있으며 분류상 혼선되는 면이 있다.\r\n" + 
				"\r\n" + 
				"식인물고기로 알려진 피라냐(Piranha)와 근연종으로 형태가 유사하나 몸길이가 80cm 내외까지 자라는 대형 담수어이다.\r특히 유어기에는 Red piranha(Serrasalmus nattereri)와 체색과 체형이 매우 비슷하지만 성장하면서 근육이 비대해져 좌우로 두껍게 보인다.\r동물성 먹이 뿐 아니라 수초나 수면에 떨어진 단단한 식물의 열매 등도 강한 턱 힘을 이용하여 부수어 먹는 잡식성이다.\r사육이 용이하고 성장이 빨라 식용어로서 이용되기도 한다.\r이빨의 형태가 사람의 것과 닮아 인치어라 불리는 경우도 있다\r\n");
		map.put("피라냐", "피라니아는 원주민어로 이빨이 있는 물고기라는 뜻을 가지고 있다.\r아래턱이 매우 발달했고, 삼각형의 날카로운 이빨이 있어 질긴 먹잇감이라도 쉽게 뜯어 먹을 수 있다.\r육식성으로 성질이 흉폭하여 하천을 건너는 소나 양 등을 습격하고 무리를 지어 공격해서 뼈와 가죽만 남기고 살은 모두 먹어 치워 버린다.\r1년이면 성숙하는데 암수의 구별이 어렵다.\r한 번에 3,000~4,000개의 오렌지색 알을 낳는다.\r\n");
		map.put("피라루쿠", "세계 최대의 담수어로, 몸길이는 3~5m, 몸무게는 200㎏에 달한다.\r그러나 아마존강에서 잡히는 피라루쿠의 몸길이는 보통 큰 것이 1.25(40㎏)~2.5m(100㎏)로, 5m짜리는 거의 보기 힘들다.\r피라루쿠의 피라는 현지어로 물고기를 뜻하고, 아루쿠(arucu)는 붉은 열매를 맺는 식물 이름으로, 이 둘을 합성한 것이 피라루쿠이다. 즉 붉은 물고기라는 뜻이다.\r기아나에서는 아라파이마라고 한다.\r\n" + 
				"\r\n" + 
				"몸통은 전체적으로 약간 둥근 원통꼴이지만, 뒤로 갈수록 세로로 넓적해지면서 높이도 낮아진다.\r머리는 가로로 넓적하며 낮다.\r입은 크고, 아래턱이 조금 튀어나와 있다.\r빛깔은 머리쪽이 옅은 녹색을 띠는 것을 제외하고 전체적으로 붉다.\r특히 꼬리 쪽으로 갈수록 점점 붉어져, 꼬리지느러미에 이르면 붉은색으로 반짝인다.\r비늘에는 붉은 얼룩무늬가 선명하게 나 있다.\r\n" + 
				"\r\n" + 
				"물 밖으로 머리를 내밀어 공기를 들이마신 뒤, 목뒤에 붙어 있는 큰 부레에 공기를 모아 공기호흡을 한다.\r산란기는 1~5월이며, 특히 4~5월에 집중적으로 알을 낳는다.\r번식기가 되면 암컷은 어두운 갈색을 띠고, 수컷은 머리가 검어지면서 꼬리가 아주 짙은 붉은색으로 변한다.\r우기에 얕은 물가로 나와 지름 50㎝, 깊이 20㎝ 정도의 큰 구멍을 파고 18만여 개에 달하는 알을 여러 번에 걸쳐 낳는다.\r5일이면 부화하고, 치어는 암수가 함께 보호한다.\r\n" + 
				"\r\n" + 
				"산지에서는 중요한 식용자원이지만, 남획으로 인해 많이 줄어들었다.\r이 때문에 1973년 3월 채택된 워싱턴협약 부속서 규정에 따라 지금은 국제거래가 규제되고 있다.\r크기가 아주 크고, 생김새가 아름다워 관상용으로도 인기가 있지만, 값이 너무 비싸 대형 수족관에서나 볼 수 있다.\r아마존강·오리노코강과 기아나 등 라틴아메리카에 분포한다.\r\n" + 
				"[네이버 지식백과] 피라루쿠 [pirarucu]세계 최대의 담수어로, 몸길이는 3~5m, 몸무게는 200㎏에 달한다.\r그러나 아마존강에서 잡히는 피라루쿠의 몸길이는 보통 큰 것이 1.25(40㎏)~2.5m(100㎏)로, 5m짜리는 거의 보기 힘들다.\r피라루쿠의 피라는 현지어로 물고기를 뜻하고,\r아루쿠(arucu)는 붉은 열매를 맺는 식물 이름으로, 이 둘을 합성한 것이 피라루쿠이다.즉 붉은 물고기라는 뜻이다. 기아나에서는 아라파이마라고 한다.\r\n" + 
				"\r\n" + 
				"몸통은 전체적으로 약간 둥근 원통꼴이지만, 뒤로 갈수록 세로로 넓적해지면서 높이도 낮아진다.\r머리는 가로로 넓적하며 낮다. 입은 크고, 아래턱이 조금 튀어나와 있다.\r빛깔은 머리쪽이 옅은 녹색을 띠는 것을 제외하고 전체적으로 붉다.\r특히 꼬리 쪽으로 갈수록 점점 붉어져, 꼬리지느러미에 이르면 붉은색으로 반짝인다.\r비늘에는 붉은 얼룩무늬가 선명하게 나 있다.\r\n" + 
				"\r\n" + 
				"물 밖으로 머리를 내밀어 공기를 들이마신 뒤, 목뒤에 붙어 있는 큰 부레에 공기를 모아 공기호흡을 한다.\r산란기는 1~5월이며, 특히 4~5월에 집중적으로 알을 낳는다.\r번식기가 되면 암컷은 어두운 갈색을 띠고, 수컷은 머리가 검어지면서 꼬리가 아주 짙은 붉은색으로 변한다.\r우기에 얕은 물가로 나와 지름 50㎝, 깊이 20㎝ 정도의 큰 구멍을 파고 18만여 개에 달하는 알을 여러 번에 걸쳐 낳는다.\r5일이면 부화하고, 치어는 암수가 함께 보호한다.\r\n" + 
				"\r\n" + 
				"산지에서는 중요한 식용자원이지만, 남획으로 인해 많이 줄어들었다.\r이 때문에 1973년 3월 채택된 워싱턴협약 부속서 규정에 따라 지금은 국제거래가 규제되고 있다.\r크기가 아주 크고, 생김새가 아름다워 관상용으로도 인기가 있지만, 값이 너무 비싸 대형 수족관에서나 볼 수 있다. 아마존강·오리노코강과 기아나 등 라틴아메리카에 분포한다.\r\n");
		map.put("악어", "악어의 몸 전체는 골판(骨板)으로 보강된 큰 비늘판으로 덮여 있는데, 머리에서 꼬리 끝에 이르는 등에는 단단한 비늘판이 덮여 있다.\r배에는 복근골(腹筋骨)이 보강되어 있으며 앨리게이터류의 배비늘판에는 골판이 발달하였다.\r외비공(外鼻孔)은 주둥이 끝에 튀어나와 열려 있으며, 인후부(咽喉部) 근처에 있는 내비공과는 긴 비강(鼻腔)으로 연결되어 있다.\r따라서 주둥이 끝을 물 위로 내밀면 물속에서 입을 벌리고 있어도 구강부가 2장의 판으로 닫혀 있으므로 기관(氣管)이나 식도에 물이 들어가지 않고 숨을 쉴 수 있다.\r먹이를 잡았을 때는 물속으로 끌고 들어가 외비공으로 숨을 쉬면서 질식시킨다.\r물속에서는 외비공과 귓구멍이 닫히며, 눈은 투명한 순막으로 덮인다. \r\n" + 
				"\r\n" + 
				"악어의 눈은 밤에 붉은색으로 빛나는데, 이는 특수한 색소가 망막에 반사되어 나타나기 때문이다.\r동공은 길쭉하다. 심장은 2심방 2심실로 파충류 중 가장 발달했으며 심실은 작은 구멍으로 연결되어 있다.\r위에는 모래주머니가 있는데, 위석(胃石)은 모래주머니에서 쓰이는 것과 몸의 평형을 유지하기 위한 것이 있다.\r이빨은 날카롭고 조밀하게 나 있으며, 위·아래 모두 20개 정도이다.\r\n");
		
		
		
		String name=sr.next();
		System.out.println(name+"에 대한설명:"+map.get(name));
		return;
		}
	}

}
