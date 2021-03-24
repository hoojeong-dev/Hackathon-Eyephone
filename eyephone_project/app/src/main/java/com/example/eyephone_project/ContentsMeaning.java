package com.example.eyephone_project;

public class ContentsMeaning {

    String[] newsWord = {"업계", "극장", "영화", "인상합니다", "인상됩니다", "위기", "극복", "관객이", "투자", "배급사",
            "제작사", "전반", "내몰리고", "상황", "생존", "불가피한", "선택", "설명했습니다", "성인", "일반",
            "기준", "조정됩니다", "비롯한", "가격", "일괄", "장애인", "유공자", "적용되는", "우대", "동일하게",
            "늘어나는", "재원으로", "신작", "촉진하기", "지급을", "당분간", "아울러", "내부적으로", "개편", "절감",
            "노력", "기반", "마련에", "주력할", "방침이라고"};
    String[] dictWord = {"업계", "극장", "영화", "인상", "인상", "위기", "극복", "관객", "투자", "배급사",
            "제작사", "전반", "내몰리다", "상황", "생존", "불가피하다", "선택", "설명하다", "성인", "일반",
            "기준", "조정", "비롯한", "가격", "일괄", "장애인", "유공자", "적용", "우대", "동일하다",
            "늘어나다", "재원", "신작", "촉진", "지급", "당분간", "아울러", "내부", "개편", "절감",
            "노력", "기반", "마련", "주력", "방침"};
    String[] meaningWord = {"어떤 일이나 대상의 내용을 상대편이 잘 알 수 있도록 밝혀 말하다.", "연극이나 음악, 무용 따위를 공연하거나 영화를 상영하기 위하여 무대와 객석 등을 설치한 건물이나 시설.", "일정한 의미를 갖고 움직이는 대상을 촬영하여 영사기로 영사막에 재현하는 종합 예술.", "물건값, 봉급, 요금 따위를 올림.", "물건값, 봉급, 요금 따위를 올림.", "위험한 고비나 시기.", "악조건이나 고생 따위를 이겨 냄.", "운동 경기, 공연, 영화 따위를 보거나 듣는 사람.", "이익을 얻기 위하여 어떤 일이나 사업에 자본을 대거나 시간이나 정성을 쏟음.", "제작된 영화를 배급하는 회사.",
            "새로운 물건이나 예술 작품을 만드는 회사.", "어떤 일이나 부문에 대하여 그것에 관계되는 전체. 또는 통틀어서 모두.", "일정한 지역 밖으로 몰려 쫓겨나다. ‘내몰다’의 피동사.", "일이 되어 가는 과정이나 형편.", "살아 있음. 또는 살아남음.", "피할 수 없다.", "여럿 가운데서 필요한 것을 골라 뽑음.", "어떤 일이나 대상의 내용을 상대편이 잘 알 수 있도록 밝혀 말하다.", "자라서 어른이 된 사람. 보통 만 19세 이상의 남녀를 이른다.", "특별하지 아니하고 평범한 수준. 또는 그런 사람들.",
            "기본이 되는 표준.", "어떤 기준이나 실정에 맞게 정돈함.", "어떤 사물이 처음 생기거나 시작하다.", "물건이 지니고 있는 가치를 돈으로 나타낸 것.", "개별적인 여러 가지 것을 한데 묶음.", "신체의 일부에 장애가 있거나 정신 능력이 원활하지 못해 일상생활이나 사회생활에서 어려움이 있는 사람.", "공로가 있는 사람.", "알맞게 이용하거나 맞추어 씀.", "특별히 잘 대우함. 또는 그런 대우.", "어떤 것과 비교하여 똑같다.",
            "본디보다 더 넉넉해지다.", "재화나 자금이 나올 원천.", "새로 작품 따위를 지어 만듦. 또는 그 작품.", "다그쳐 빨리 나아가게 함.", "돈이나 물품 따위를 정하여진 몫만큼 내줌.", "앞으로 얼마간. 또는 잠시 동안.", "동시에 함께.", "어떤 조직에 속하는 범위의 안.", "조직 따위를 고쳐 편성함.", "아끼어 줄임.",
            "목적을 이루기 위하여 몸과 마음을 다하여 애를 씀.", "기초가 되는 바탕. 또는 사물의 토대.", "헤아려서 갖춤.", "중심이 되는 힘. 또는 그런 세력.", "앞으로 일을 치러 나갈 방향과 계획."};

    public String[] wordcompare(String getWord){
        String[] newsdata = new String[2];
        for(int i=0; i<45; i++){
            if(getWord.equals(newsWord[i])==true) {
                newsdata[0] = dictWord[i];
                newsdata[1] = meaningWord[i];
                break;
            }
        }
        return newsdata;
    }
}
