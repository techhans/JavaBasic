package _230428;

public class Thymeleaf01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		[컨트롤러에서 지정한 model 모델 형식]
		model.addAttribute("name", "twok"); // [key, value]
		model.addAttribute("age", 28); // [key, value]
		model.addAttribute("sex", "M"); // [key, value]




		List<Insert_Each_List_Model> tables = new ArrayList<>();
		for (int i=1; i<=5; i++){
		  // 이름 / 나이 / 성별 데이터 삽입
		  tables.add(new Insert_Each_List_Model(name+String.valueOf(i), String.valueOf(i), "M"));
		}
		model.addAttribute("tableList", tables); //value 값에 객체 지정 실시


	}

}


@GetMapping("/testThymeleafLang")
public String testThymeleafLang(@RequestParam Map<String, String> param, Model model){

	// [Model (모델) 에 일반 key , value 지정 실시]
	model.addAttribute("name", "twok"); // [key, value]
	model.addAttribute("age", 28); // [key, value]
	model.addAttribute("sex", "M"); // [key, value]

	// [Model (모델) 에 리스트 객체 데이터 삽입 실시]
	String name = "twok";
	List<Insert_Each_List_Model> tables = new ArrayList<>();
	for (int i=1; i<=5; i++){
		// 이름 / 나이 / 성별 데이터 삽입
		tables.add(new Insert_Each_List_Model(name+String.valueOf(i), String.valueOf(i), "M"));
	}
	model.addAttribute("tableList", tables); //value 값에 객체 지정 실시

	// [testThymeleafLang.html 호출]
	return "testThymeleafLang";
}


@GetMapping("/testThymeleafLang")
public String testThymeleafLang(@RequestParam Map<String, String> param, Model model){

	// [Model (모델) 에 일반 key , value 지정 실시]
	model.addAttribute("name", "twok"); // [key, value]
	model.addAttribute("age", 28); // [key, value]
	model.addAttribute("gender", "M"); // [key, value]

	// [Model (모델) 에 리스트 객체 데이터 삽입 실시]
	String name = "twok";
	List<Insert_Each_List_Model> tables = new ArrayList<>();
	for (int i=1; i<=5; i++){
		// 이름 / 나이 / 성별 데이터 삽입
		tables.add(new Insert_Each_List_Model(name+String.valueOf(i), String.valueOf(i), "M"));
	}
	model.addAttribute("tableList", tables); //value 값에 객체 지정 실시

	// [testThymeleafLang.html 호출]
	return "testThymeleafLang";
}