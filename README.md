# Todo CLI (Java)

Командын мөрөөс ажилладаг энгийн хийх ажлын жагсаалтын програм. Java хэлээр бичигдсэн.

## Онцлог
- Ажил нэмэх
- Ажлын жагсаалт харах
- Ажлыг дууссан гэж тэмдэглэх
- Ажил устгах

## Шаардлага
- Java JDK 17 эсвэл түүнээс дээш

Хувилбараа шалгах:
```bash
java -version
```

## Суулгах
```bash
git clone https://github.com/username/todo-cli.git
cd todo-cli
```

## Хөрвүүлэх (Compile)
```bash
javac -d out src/*.java
```

## Ажиллуулах
```bash
java -cp out Main
```

Програм ажиллаж эхэлмэгц дараах командуудыг ашиглана:

| Команд | Тайлбар |
|--------|---------|
| `add <ажил>` | Шинэ ажил нэмэх |
| `list` | Бүх ажлыг харах |
| `done <id>` | Ажлыг дууссан гэж тэмдэглэх |
| `delete <id>` | Ажлыг устгах |
| `exit` | Програмаас гарах |

Жишээ:
```
> add Ном уншах
> add Даалгавар хийх
> list
1. [ ] Ном уншах
2. [ ] Даалгавар хийх
> done 1
> list
1. [x] Ном уншах
2. [ ] Даалгавар хийх
```

## Төслийн бүтэц
```
todo-cli/
├── src/
│   ├── Main.java
│   ├── Task.java
│   └── TaskManager.java
└── README.md
```

## Лиценз
MIT

## Commit messages
```
feat: add delete command to remove tasks by id
fix: handle empty task list without throwing exception
```
