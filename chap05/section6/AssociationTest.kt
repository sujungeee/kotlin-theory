package chap05.section6.association

// 연관 관계 : 2개의 서로 분리된 클래스가 연결을 가지는 것

class Patient(val name: String){
    fun doctorList(d: Doctor){
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String){
    fun patientList(p: Patient){
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main(){
    val doc1 = Doctor("KimSabu")
    val patient1 = Patient("Kildong")
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}