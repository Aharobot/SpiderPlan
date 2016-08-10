(define (problem problems-p-u0-h1-g10-id01-a0111-uddl)
	(:domain household)
	(:objects
		trecharge-r1 trecharge-r2 trecharge-r3 trecharge-r4 tCollectlaundry1 tSortstuff2 tAssist3 tCollecttrash4 tTakeouttrash5 tEntertain6 tVaccuum7 tCollectlaundry8 tEntertain9 tTakeouttrash10  - robot-task
	)
	(:init
		(at r1 robotRoom)
		(at r2 robotRoom)
		(at r3 robotRoom)
		(at r4 robotRoom)
		(state tCollectlaundry1 collectLaundry bathroom3 waiting)
		(state tSortstuff2 sortStuff bedroomParents waiting)
		(state tAssist3 assist storage waiting)
		(state tCollecttrash4 collectTrash kitchen waiting)
		(state tTakeouttrash5 takeOutTrash out waiting)
		(state tEntertain6 entertain livingRoom waiting)
		(state tVaccuum7 vaccuum kitchen waiting)
		(state tCollectlaundry8 collectLaundry bathroom3 waiting)
		(state tEntertain9 entertain kidsRoom1 waiting)
		(state tTakeouttrash10 takeOutTrash out waiting)
		(at 0 (human-activity mother kitchen cooking))
		(at 59 (not (human-activity mother kitchen cooking)))
		(at 60 (human-activity mother bathroom2 usingBathroom))
		(at 106 (not (human-activity mother bathroom2 usingBathroom)))
		(at 107 (human-activity mother kitchen cooking))
		(at 162 (not (human-activity mother kitchen cooking)))
		(at 163 (human-activity mother bedroomParents sleeping))
		(at 217 (not (human-activity mother bedroomParents sleeping)))
		(at 218 (human-activity mother kitchen cooking))
		(at 249 (not (human-activity mother kitchen cooking)))
		(at 250 (human-activity mother diningRoom eating))
		(at 294 (not (human-activity mother diningRoom eating)))
		(at 295 (human-activity mother out being-out))
		(at 327 (not (human-activity mother out being-out)))
		(at 328 (human-activity mother basement idle))
		(at 381 (not (human-activity mother basement idle)))
		(at 382 (human-activity mother livingRoom sleeping))
		(at 432 (not (human-activity mother livingRoom sleeping)))
		(at 433 (human-activity mother kitchen working))
		(at 468 (not (human-activity mother kitchen working)))
		(at 469 (human-activity mother out being-out))
		(at 513 (not (human-activity mother out being-out)))
		(at 514 (human-activity mother livingRoom sleeping))
		(at 567 (not (human-activity mother livingRoom sleeping)))
		(at 568 (human-activity mother diningRoom eating))
		(at 623 (not (human-activity mother diningRoom eating)))
		(at 624 (human-activity mother study idle))
		(at 674 (not (human-activity mother study idle)))
		(at 675 (human-activity mother diningRoom reading))
		(at 734 (not (human-activity mother diningRoom reading)))
		(at 735 (human-activity mother kitchen cooking))
		(at 786 (not (human-activity mother kitchen cooking)))
		(at 787 (human-activity mother basement working))
		(at 838 (not (human-activity mother basement working)))
		(at 839 (human-activity mother diningRoom reading))
		(at 872 (not (human-activity mother diningRoom reading)))
		(at 873 (human-activity mother kitchen idle))
		(at 930 (not (human-activity mother kitchen idle)))
		(at 931 (human-activity mother diningRoom eating))
		(at 968 (not (human-activity mother diningRoom eating)))
		(at 969 (human-activity mother kitchen sleeping))
		(at 1440 (not (human-activity mother kitchen sleeping)))
		(at 0 (human-activity father livingRoom idle))
		(at 52 (not (human-activity father livingRoom idle)))
		(at 53 (human-activity father livingRoom sleeping))
		(at 98 (not (human-activity father livingRoom sleeping)))
		(at 99 (human-activity father out playing))
		(at 159 (not (human-activity father out playing)))
		(at 160 (human-activity father out being-out))
		(at 200 (not (human-activity father out being-out)))
		(at 201 (human-activity father storage working))
		(at 257 (not (human-activity father storage working)))
		(at 258 (human-activity father kitchen reading))
		(at 306 (not (human-activity father kitchen reading)))
		(at 307 (human-activity father bathroom3 usingBathroom))
		(at 367 (not (human-activity father bathroom3 usingBathroom)))
		(at 368 (human-activity father livingRoom idle))
		(at 415 (not (human-activity father livingRoom idle)))
		(at 416 (human-activity father diningRoom eating))
		(at 447 (not (human-activity father diningRoom eating)))
		(at 448 (human-activity father bedroomParents sleeping))
		(at 479 (not (human-activity father bedroomParents sleeping)))
		(at 480 (human-activity father out being-out))
		(at 538 (not (human-activity father out being-out)))
		(at 539 (human-activity father kitchen cooking))
		(at 590 (not (human-activity father kitchen cooking)))
		(at 591 (human-activity father bedroomParents sleeping))
		(at 621 (not (human-activity father bedroomParents sleeping)))
		(at 622 (human-activity father out working))
		(at 661 (not (human-activity father out working)))
		(at 662 (human-activity father bathroom4 usingBathroom))
		(at 704 (not (human-activity father bathroom4 usingBathroom)))
		(at 705 (human-activity father kitchen eating))
		(at 753 (not (human-activity father kitchen eating)))
		(at 754 (human-activity father out being-out))
		(at 804 (not (human-activity father out being-out)))
		(at 805 (human-activity father kitchen cooking))
		(at 856 (not (human-activity father kitchen cooking)))
		(at 857 (human-activity father floor2 idle))
		(at 917 (not (human-activity father floor2 idle)))
		(at 918 (human-activity father bedroomParents reading))
		(at 950 (not (human-activity father bedroomParents reading)))
		(at 951 (human-activity father bedroomParents sleeping))
		(at 991 (not (human-activity father bedroomParents sleeping)))
		(at 992 (human-activity father bedroomParents sleeping))
		(at 1440 (not (human-activity father bedroomParents sleeping)))
		(at 0 (human-activity kid1 kitchen eating))
		(at 47 (not (human-activity kid1 kitchen eating)))
		(at 48 (human-activity kid1 kidsRoom2 idle))
		(at 100 (not (human-activity kid1 kidsRoom2 idle)))
		(at 101 (human-activity kid1 diningRoom playing))
		(at 136 (not (human-activity kid1 diningRoom playing)))
		(at 137 (human-activity kid1 diningRoom idle))
		(at 193 (not (human-activity kid1 diningRoom idle)))
		(at 194 (human-activity kid1 livingRoom playing))
		(at 247 (not (human-activity kid1 livingRoom playing)))
		(at 248 (human-activity kid1 diningRoom playing))
		(at 282 (not (human-activity kid1 diningRoom playing)))
		(at 283 (human-activity kid1 out being-out))
		(at 332 (not (human-activity kid1 out being-out)))
		(at 333 (human-activity kid1 kidsRoom2 playing))
		(at 371 (not (human-activity kid1 kidsRoom2 playing)))
		(at 372 (human-activity kid1 kitchen working))
		(at 408 (not (human-activity kid1 kitchen working)))
		(at 409 (human-activity kid1 study reading))
		(at 451 (not (human-activity kid1 study reading)))
		(at 452 (human-activity kid1 out working))
		(at 509 (not (human-activity kid1 out working)))
		(at 510 (human-activity kid1 livingRoom eating))
		(at 559 (not (human-activity kid1 livingRoom eating)))
		(at 560 (human-activity kid1 livingRoom reading))
		(at 618 (not (human-activity kid1 livingRoom reading)))
		(at 619 (human-activity kid1 out being-out))
		(at 675 (not (human-activity kid1 out being-out)))
		(at 676 (human-activity kid1 kidsRoom1 playing))
		(at 717 (not (human-activity kid1 kidsRoom1 playing)))
		(at 718 (human-activity kid1 livingRoom reading))
		(at 775 (not (human-activity kid1 livingRoom reading)))
		(at 776 (human-activity kid1 kitchen eating))
		(at 832 (not (human-activity kid1 kitchen eating)))
		(at 833 (human-activity kid1 diningRoom eating))
		(at 875 (not (human-activity kid1 diningRoom eating)))
		(at 876 (human-activity kid1 diningRoom eating))
		(at 925 (not (human-activity kid1 diningRoom eating)))
		(at 926 (human-activity kid1 out being-out))
		(at 978 (not (human-activity kid1 out being-out)))
		(at 979 (human-activity kid1 kidsRoom2 sleeping))
		(at 1440 (not (human-activity kid1 kidsRoom2 sleeping)))
		(at 0 (human-activity kid2 kidsRoom1 idle))
		(at 48 (not (human-activity kid2 kidsRoom1 idle)))
		(at 49 (human-activity kid2 bathroom4 usingBathroom))
		(at 84 (not (human-activity kid2 bathroom4 usingBathroom)))
		(at 85 (human-activity kid2 out being-out))
		(at 118 (not (human-activity kid2 out being-out)))
		(at 119 (human-activity kid2 study reading))
		(at 175 (not (human-activity kid2 study reading)))
		(at 176 (human-activity kid2 kidsRoom2 sleeping))
		(at 218 (not (human-activity kid2 kidsRoom2 sleeping)))
		(at 219 (human-activity kid2 out being-out))
		(at 263 (not (human-activity kid2 out being-out)))
		(at 264 (human-activity kid2 kidsRoom1 reading))
		(at 299 (not (human-activity kid2 kidsRoom1 reading)))
		(at 300 (human-activity kid2 out being-out))
		(at 345 (not (human-activity kid2 out being-out)))
		(at 346 (human-activity kid2 diningRoom reading))
		(at 406 (not (human-activity kid2 diningRoom reading)))
		(at 407 (human-activity kid2 livingRoom playing))
		(at 452 (not (human-activity kid2 livingRoom playing)))
		(at 453 (human-activity kid2 diningRoom eating))
		(at 499 (not (human-activity kid2 diningRoom eating)))
		(at 500 (human-activity kid2 livingRoom eating))
		(at 552 (not (human-activity kid2 livingRoom eating)))
		(at 553 (human-activity kid2 diningRoom eating))
		(at 584 (not (human-activity kid2 diningRoom eating)))
		(at 585 (human-activity kid2 livingRoom reading))
		(at 627 (not (human-activity kid2 livingRoom reading)))
		(at 628 (human-activity kid2 livingRoom reading))
		(at 669 (not (human-activity kid2 livingRoom reading)))
		(at 670 (human-activity kid2 out being-out))
		(at 714 (not (human-activity kid2 out being-out)))
		(at 715 (human-activity kid2 out being-out))
		(at 775 (not (human-activity kid2 out being-out)))
		(at 776 (human-activity kid2 out working))
		(at 810 (not (human-activity kid2 out working)))
		(at 811 (human-activity kid2 storage working))
		(at 841 (not (human-activity kid2 storage working)))
		(at 842 (human-activity kid2 out being-out))
		(at 899 (not (human-activity kid2 out being-out)))
		(at 900 (human-activity kid2 bathroom3 usingBathroom))
		(at 935 (not (human-activity kid2 bathroom3 usingBathroom)))
		(at 936 (human-activity kid2 diningRoom playing))
		(at 984 (not (human-activity kid2 diningRoom playing)))
		(at 985 (human-activity kid2 livingRoom sleeping))
		(at 1440 (not (human-activity kid2 livingRoom sleeping)))
		(at 0 (human-activity grandfather1 out being-out))
		(at 32 (not (human-activity grandfather1 out being-out)))
		(at 33 (human-activity grandfather1 kitchen cooking))
		(at 66 (not (human-activity grandfather1 kitchen cooking)))
		(at 67 (human-activity grandfather1 bathroom1 usingBathroom))
		(at 105 (not (human-activity grandfather1 bathroom1 usingBathroom)))
		(at 106 (human-activity grandfather1 livingRoom eating))
		(at 141 (not (human-activity grandfather1 livingRoom eating)))
		(at 142 (human-activity grandfather1 out playing))
		(at 179 (not (human-activity grandfather1 out playing)))
		(at 180 (human-activity grandfather1 kidsRoom2 playing))
		(at 211 (not (human-activity grandfather1 kidsRoom2 playing)))
		(at 212 (human-activity grandfather1 bedroomGrandparents2 reading))
		(at 252 (not (human-activity grandfather1 bedroomGrandparents2 reading)))
		(at 253 (human-activity grandfather1 kitchen cooking))
		(at 290 (not (human-activity grandfather1 kitchen cooking)))
		(at 291 (human-activity grandfather1 bedroomGrandparents2 sleeping))
		(at 334 (not (human-activity grandfather1 bedroomGrandparents2 sleeping)))
		(at 335 (human-activity grandfather1 laundryRoom working))
		(at 375 (not (human-activity grandfather1 laundryRoom working)))
		(at 376 (human-activity grandfather1 bathroom3 usingBathroom))
		(at 430 (not (human-activity grandfather1 bathroom3 usingBathroom)))
		(at 431 (human-activity grandfather1 kidsRoom1 idle))
		(at 464 (not (human-activity grandfather1 kidsRoom1 idle)))
		(at 465 (human-activity grandfather1 floor2 idle))
		(at 521 (not (human-activity grandfather1 floor2 idle)))
		(at 522 (human-activity grandfather1 kitchen reading))
		(at 558 (not (human-activity grandfather1 kitchen reading)))
		(at 559 (human-activity grandfather1 storage working))
		(at 617 (not (human-activity grandfather1 storage working)))
		(at 618 (human-activity grandfather1 kitchen cooking))
		(at 663 (not (human-activity grandfather1 kitchen cooking)))
		(at 664 (human-activity grandfather1 out being-out))
		(at 699 (not (human-activity grandfather1 out being-out)))
		(at 700 (human-activity grandfather1 out being-out))
		(at 739 (not (human-activity grandfather1 out being-out)))
		(at 740 (human-activity grandfather1 bedroomGrandparents1 sleeping))
		(at 779 (not (human-activity grandfather1 bedroomGrandparents1 sleeping)))
		(at 780 (human-activity grandfather1 out playing))
		(at 827 (not (human-activity grandfather1 out playing)))
		(at 828 (human-activity grandfather1 storage working))
		(at 871 (not (human-activity grandfather1 storage working)))
		(at 872 (human-activity grandfather1 kitchen cooking))
		(at 912 (not (human-activity grandfather1 kitchen cooking)))
		(at 913 (human-activity grandfather1 study reading))
		(at 959 (not (human-activity grandfather1 study reading)))
		(at 960 (human-activity grandfather1 bedroomGrandparents1 sleeping))
		(at 1440 (not (human-activity grandfather1 bedroomGrandparents1 sleeping)))

		;; Fixed relations
		(adjacent out floor1)
		(adjacent floor1 floor2)
		(adjacent basement floor1)
		(adjacent basement floor2)
		(adjacent out floor1)
		(adjacent floor1 floor2)
		(adjacent basement floor1)
		(adjacent basement floor2)
		
		(adjacent floor1 bathroom1)
		(adjacent floor2 bathroom2)
		(adjacent floor1 livingRoom)
		(adjacent floor1 diningRoom)
		(adjacent diningRoom kitchen)
		(adjacent floor1 kidsRoom1)
		(adjacent floor1 kidsRoom2)
		(adjacent floor2 bedroomParents)
		(adjacent floor2 study)
		(adjacent floor2 bedroomGrandparents1)
		(adjacent floor2 bedroomGrandparents2)
		(adjacent bedroomGrandparents1 bathroom3)
		(adjacent bedroomGrandparents2 bathroom4)
		
		(adjacent basement robotRoom)
		(adjacent basement laundryRoom)
		(adjacent basement storage)

		(adjacent floor1 out)
		(adjacent floor2 floor1)
		(adjacent floor1 basement)
		(adjacent floor2 basement)
		(adjacent floor1 out )
		(adjacent floor2 floor1 )
		(adjacent floor1 basement )
		(adjacent floor2 basement )
		
		(adjacent bathroom1 floor1 )
		(adjacent bathroom2 floor2 )
		(adjacent livingRoom floor1 )
		(adjacent diningRoom floor1 )
		(adjacent kitchen diningRoom )
		(adjacent kidsRoom1 floor1 )
		(adjacent kidsRoom2 floor1 )
		(adjacent bedroomParents floor2 )
		(adjacent study floor2 )
		(adjacent bedroomGrandparents1 floor2 )
		(adjacent bedroomGrandparents2 floor2 )
		(adjacent bathroom3 bedroomGrandparents1 )
		(adjacent bathroom4 bedroomGrandparents2 )
		
		(adjacent robotRoom basement )
		(adjacent laundryRoom basement )
		(adjacent storage basement )

		(= (movement-time floor1 floor2) 5)
		(= (movement-time floor1 basement) 5)
		(= (movement-time floor2 floor1) 5)
		(= (movement-time floor2 basement) 5)
		(= (movement-time basement floor1) 5)
		(= (movement-time basement floor2) 5)

		(= (movement-time robotRoom floor1) 1)
		(= (movement-time robotRoom floor2) 1)
		(= (movement-time robotRoom basement) 1)
		(= (movement-time robotRoom livingRoom) 1)
		(= (movement-time robotRoom kitchen) 1)
		(= (movement-time robotRoom diningRoom) 1)
		(= (movement-time robotRoom bedroomParents) 1)
		(= (movement-time robotRoom bedroomGrandparents1) 1)
		(= (movement-time robotRoom bedroomGrandparents2) 1)
		(= (movement-time robotRoom kidsRoom1) 1)
		(= (movement-time robotRoom kidsRoom2) 1)
		(= (movement-time robotRoom bathroom1) 1)
		(= (movement-time robotRoom bathroom2) 1)
		(= (movement-time robotRoom bathroom3) 1)
		(= (movement-time robotRoom bathroom4) 1)
		(= (movement-time robotRoom laundryRoom) 1)
		(= (movement-time robotRoom storage) 1)
		(= (movement-time robotRoom out) 1)
		(= (movement-time robotRoom study) 1)
		(= (movement-time floor1 robotRoom) 1)
		(= (movement-time floor1 livingRoom) 1)
		(= (movement-time floor1 kitchen) 1)
		(= (movement-time floor1 diningRoom) 1)
		(= (movement-time floor1 bedroomParents) 1)
		(= (movement-time floor1 bedroomGrandparents1) 1)
		(= (movement-time floor1 bedroomGrandparents2) 1)
		(= (movement-time floor1 kidsRoom1) 1)
		(= (movement-time floor1 kidsRoom2) 1)
		(= (movement-time floor1 bathroom1) 1)
		(= (movement-time floor1 bathroom2) 1)
		(= (movement-time floor1 bathroom3) 1)
		(= (movement-time floor1 bathroom4) 1)
		(= (movement-time floor1 laundryRoom) 1)
		(= (movement-time floor1 storage) 1)
		(= (movement-time floor1 out) 1)
		(= (movement-time floor1 study) 1)
		(= (movement-time floor2 robotRoom) 1)
		(= (movement-time floor2 livingRoom) 1)
		(= (movement-time floor2 kitchen) 1)
		(= (movement-time floor2 diningRoom) 1)
		(= (movement-time floor2 bedroomParents) 1)
		(= (movement-time floor2 bedroomGrandparents1) 1)
		(= (movement-time floor2 bedroomGrandparents2) 1)
		(= (movement-time floor2 kidsRoom1) 1)
		(= (movement-time floor2 kidsRoom2) 1)
		(= (movement-time floor2 bathroom1) 1)
		(= (movement-time floor2 bathroom2) 1)
		(= (movement-time floor2 bathroom3) 1)
		(= (movement-time floor2 bathroom4) 1)
		(= (movement-time floor2 laundryRoom) 1)
		(= (movement-time floor2 storage) 1)
		(= (movement-time floor2 out) 1)
		(= (movement-time floor2 study) 1)
		(= (movement-time basement robotRoom) 1)
		(= (movement-time basement livingRoom) 1)
		(= (movement-time basement kitchen) 1)
		(= (movement-time basement diningRoom) 1)
		(= (movement-time basement bedroomParents) 1)
		(= (movement-time basement bedroomGrandparents1) 1)
		(= (movement-time basement bedroomGrandparents2) 1)
		(= (movement-time basement kidsRoom1) 1)
		(= (movement-time basement kidsRoom2) 1)
		(= (movement-time basement bathroom1) 1)
		(= (movement-time basement bathroom2) 1)
		(= (movement-time basement bathroom3) 1)
		(= (movement-time basement bathroom4) 1)
		(= (movement-time basement laundryRoom) 1)
		(= (movement-time basement storage) 1)
		(= (movement-time basement out) 1)
		(= (movement-time basement study) 1)
		(= (movement-time livingRoom robotRoom) 1)
		(= (movement-time livingRoom floor1) 1)
		(= (movement-time livingRoom floor2) 1)
		(= (movement-time livingRoom basement) 1)
		(= (movement-time livingRoom kitchen) 1)
		(= (movement-time livingRoom diningRoom) 1)
		(= (movement-time livingRoom bedroomParents) 1)
		(= (movement-time livingRoom bedroomGrandparents1) 1)
		(= (movement-time livingRoom bedroomGrandparents2) 1)
		(= (movement-time livingRoom kidsRoom1) 1)
		(= (movement-time livingRoom kidsRoom2) 1)
		(= (movement-time livingRoom bathroom1) 1)
		(= (movement-time livingRoom bathroom2) 1)
		(= (movement-time livingRoom bathroom3) 1)
		(= (movement-time livingRoom bathroom4) 1)
		(= (movement-time livingRoom laundryRoom) 1)
		(= (movement-time livingRoom storage) 1)
		(= (movement-time livingRoom out) 1)
		(= (movement-time livingRoom study) 1)
		(= (movement-time kitchen robotRoom) 1)
		(= (movement-time kitchen floor1) 1)
		(= (movement-time kitchen floor2) 1)
		(= (movement-time kitchen basement) 1)
		(= (movement-time kitchen livingRoom) 1)
		(= (movement-time kitchen diningRoom) 1)
		(= (movement-time kitchen bedroomParents) 1)
		(= (movement-time kitchen bedroomGrandparents1) 1)
		(= (movement-time kitchen bedroomGrandparents2) 1)
		(= (movement-time kitchen kidsRoom1) 1)
		(= (movement-time kitchen kidsRoom2) 1)
		(= (movement-time kitchen bathroom1) 1)
		(= (movement-time kitchen bathroom2) 1)
		(= (movement-time kitchen bathroom3) 1)
		(= (movement-time kitchen bathroom4) 1)
		(= (movement-time kitchen laundryRoom) 1)
		(= (movement-time kitchen storage) 1)
		(= (movement-time kitchen out) 1)
		(= (movement-time kitchen study) 1)
		(= (movement-time diningRoom robotRoom) 1)
		(= (movement-time diningRoom floor1) 1)
		(= (movement-time diningRoom floor2) 1)
		(= (movement-time diningRoom basement) 1)
		(= (movement-time diningRoom livingRoom) 1)
		(= (movement-time diningRoom kitchen) 1)
		(= (movement-time diningRoom bedroomParents) 1)
		(= (movement-time diningRoom bedroomGrandparents1) 1)
		(= (movement-time diningRoom bedroomGrandparents2) 1)
		(= (movement-time diningRoom kidsRoom1) 1)
		(= (movement-time diningRoom kidsRoom2) 1)
		(= (movement-time diningRoom bathroom1) 1)
		(= (movement-time diningRoom bathroom2) 1)
		(= (movement-time diningRoom bathroom3) 1)
		(= (movement-time diningRoom bathroom4) 1)
		(= (movement-time diningRoom laundryRoom) 1)
		(= (movement-time diningRoom storage) 1)
		(= (movement-time diningRoom out) 1)
		(= (movement-time diningRoom study) 1)
		(= (movement-time bedroomParents robotRoom) 1)
		(= (movement-time bedroomParents floor1) 1)
		(= (movement-time bedroomParents floor2) 1)
		(= (movement-time bedroomParents basement) 1)
		(= (movement-time bedroomParents livingRoom) 1)
		(= (movement-time bedroomParents kitchen) 1)
		(= (movement-time bedroomParents diningRoom) 1)
		(= (movement-time bedroomParents bedroomGrandparents1) 1)
		(= (movement-time bedroomParents bedroomGrandparents2) 1)
		(= (movement-time bedroomParents kidsRoom1) 1)
		(= (movement-time bedroomParents kidsRoom2) 1)
		(= (movement-time bedroomParents bathroom1) 1)
		(= (movement-time bedroomParents bathroom2) 1)
		(= (movement-time bedroomParents bathroom3) 1)
		(= (movement-time bedroomParents bathroom4) 1)
		(= (movement-time bedroomParents laundryRoom) 1)
		(= (movement-time bedroomParents storage) 1)
		(= (movement-time bedroomParents out) 1)
		(= (movement-time bedroomParents study) 1)
		(= (movement-time bedroomGrandparents1 robotRoom) 1)
		(= (movement-time bedroomGrandparents1 floor1) 1)
		(= (movement-time bedroomGrandparents1 floor2) 1)
		(= (movement-time bedroomGrandparents1 basement) 1)
		(= (movement-time bedroomGrandparents1 livingRoom) 1)
		(= (movement-time bedroomGrandparents1 kitchen) 1)
		(= (movement-time bedroomGrandparents1 diningRoom) 1)
		(= (movement-time bedroomGrandparents1 bedroomParents) 1)
		(= (movement-time bedroomGrandparents1 bedroomGrandparents2) 1)
		(= (movement-time bedroomGrandparents1 kidsRoom1) 1)
		(= (movement-time bedroomGrandparents1 kidsRoom2) 1)
		(= (movement-time bedroomGrandparents1 bathroom1) 1)
		(= (movement-time bedroomGrandparents1 bathroom2) 1)
		(= (movement-time bedroomGrandparents1 bathroom3) 1)
		(= (movement-time bedroomGrandparents1 bathroom4) 1)
		(= (movement-time bedroomGrandparents1 laundryRoom) 1)
		(= (movement-time bedroomGrandparents1 storage) 1)
		(= (movement-time bedroomGrandparents1 out) 1)
		(= (movement-time bedroomGrandparents1 study) 1)
		(= (movement-time bedroomGrandparents2 robotRoom) 1)
		(= (movement-time bedroomGrandparents2 floor1) 1)
		(= (movement-time bedroomGrandparents2 floor2) 1)
		(= (movement-time bedroomGrandparents2 basement) 1)
		(= (movement-time bedroomGrandparents2 livingRoom) 1)
		(= (movement-time bedroomGrandparents2 kitchen) 1)
		(= (movement-time bedroomGrandparents2 diningRoom) 1)
		(= (movement-time bedroomGrandparents2 bedroomParents) 1)
		(= (movement-time bedroomGrandparents2 bedroomGrandparents1) 1)
		(= (movement-time bedroomGrandparents2 kidsRoom1) 1)
		(= (movement-time bedroomGrandparents2 kidsRoom2) 1)
		(= (movement-time bedroomGrandparents2 bathroom1) 1)
		(= (movement-time bedroomGrandparents2 bathroom2) 1)
		(= (movement-time bedroomGrandparents2 bathroom3) 1)
		(= (movement-time bedroomGrandparents2 bathroom4) 1)
		(= (movement-time bedroomGrandparents2 laundryRoom) 1)
		(= (movement-time bedroomGrandparents2 storage) 1)
		(= (movement-time bedroomGrandparents2 out) 1)
		(= (movement-time bedroomGrandparents2 study) 1)
		(= (movement-time kidsRoom1 robotRoom) 1)
		(= (movement-time kidsRoom1 floor1) 1)
		(= (movement-time kidsRoom1 floor2) 1)
		(= (movement-time kidsRoom1 basement) 1)
		(= (movement-time kidsRoom1 livingRoom) 1)
		(= (movement-time kidsRoom1 kitchen) 1)
		(= (movement-time kidsRoom1 diningRoom) 1)
		(= (movement-time kidsRoom1 bedroomParents) 1)
		(= (movement-time kidsRoom1 bedroomGrandparents1) 1)
		(= (movement-time kidsRoom1 bedroomGrandparents2) 1)
		(= (movement-time kidsRoom1 kidsRoom2) 1)
		(= (movement-time kidsRoom1 bathroom1) 1)
		(= (movement-time kidsRoom1 bathroom2) 1)
		(= (movement-time kidsRoom1 bathroom3) 1)
		(= (movement-time kidsRoom1 bathroom4) 1)
		(= (movement-time kidsRoom1 laundryRoom) 1)
		(= (movement-time kidsRoom1 storage) 1)
		(= (movement-time kidsRoom1 out) 1)
		(= (movement-time kidsRoom1 study) 1)
		(= (movement-time kidsRoom2 robotRoom) 1)
		(= (movement-time kidsRoom2 floor1) 1)
		(= (movement-time kidsRoom2 floor2) 1)
		(= (movement-time kidsRoom2 basement) 1)
		(= (movement-time kidsRoom2 livingRoom) 1)
		(= (movement-time kidsRoom2 kitchen) 1)
		(= (movement-time kidsRoom2 diningRoom) 1)
		(= (movement-time kidsRoom2 bedroomParents) 1)
		(= (movement-time kidsRoom2 bedroomGrandparents1) 1)
		(= (movement-time kidsRoom2 bedroomGrandparents2) 1)
		(= (movement-time kidsRoom2 kidsRoom1) 1)
		(= (movement-time kidsRoom2 bathroom1) 1)
		(= (movement-time kidsRoom2 bathroom2) 1)
		(= (movement-time kidsRoom2 bathroom3) 1)
		(= (movement-time kidsRoom2 bathroom4) 1)
		(= (movement-time kidsRoom2 laundryRoom) 1)
		(= (movement-time kidsRoom2 storage) 1)
		(= (movement-time kidsRoom2 out) 1)
		(= (movement-time kidsRoom2 study) 1)
		(= (movement-time bathroom1 robotRoom) 1)
		(= (movement-time bathroom1 floor1) 1)
		(= (movement-time bathroom1 floor2) 1)
		(= (movement-time bathroom1 basement) 1)
		(= (movement-time bathroom1 livingRoom) 1)
		(= (movement-time bathroom1 kitchen) 1)
		(= (movement-time bathroom1 diningRoom) 1)
		(= (movement-time bathroom1 bedroomParents) 1)
		(= (movement-time bathroom1 bedroomGrandparents1) 1)
		(= (movement-time bathroom1 bedroomGrandparents2) 1)
		(= (movement-time bathroom1 kidsRoom1) 1)
		(= (movement-time bathroom1 kidsRoom2) 1)
		(= (movement-time bathroom1 bathroom2) 1)
		(= (movement-time bathroom1 bathroom3) 1)
		(= (movement-time bathroom1 bathroom4) 1)
		(= (movement-time bathroom1 laundryRoom) 1)
		(= (movement-time bathroom1 storage) 1)
		(= (movement-time bathroom1 out) 1)
		(= (movement-time bathroom1 study) 1)
		(= (movement-time bathroom2 robotRoom) 1)
		(= (movement-time bathroom2 floor1) 1)
		(= (movement-time bathroom2 floor2) 1)
		(= (movement-time bathroom2 basement) 1)
		(= (movement-time bathroom2 livingRoom) 1)
		(= (movement-time bathroom2 kitchen) 1)
		(= (movement-time bathroom2 diningRoom) 1)
		(= (movement-time bathroom2 bedroomParents) 1)
		(= (movement-time bathroom2 bedroomGrandparents1) 1)
		(= (movement-time bathroom2 bedroomGrandparents2) 1)
		(= (movement-time bathroom2 kidsRoom1) 1)
		(= (movement-time bathroom2 kidsRoom2) 1)
		(= (movement-time bathroom2 bathroom1) 1)
		(= (movement-time bathroom2 bathroom3) 1)
		(= (movement-time bathroom2 bathroom4) 1)
		(= (movement-time bathroom2 laundryRoom) 1)
		(= (movement-time bathroom2 storage) 1)
		(= (movement-time bathroom2 out) 1)
		(= (movement-time bathroom2 study) 1)
		(= (movement-time bathroom3 robotRoom) 1)
		(= (movement-time bathroom3 floor1) 1)
		(= (movement-time bathroom3 floor2) 1)
		(= (movement-time bathroom3 basement) 1)
		(= (movement-time bathroom3 livingRoom) 1)
		(= (movement-time bathroom3 kitchen) 1)
		(= (movement-time bathroom3 diningRoom) 1)
		(= (movement-time bathroom3 bedroomParents) 1)
		(= (movement-time bathroom3 bedroomGrandparents1) 1)
		(= (movement-time bathroom3 bedroomGrandparents2) 1)
		(= (movement-time bathroom3 kidsRoom1) 1)
		(= (movement-time bathroom3 kidsRoom2) 1)
		(= (movement-time bathroom3 bathroom1) 1)
		(= (movement-time bathroom3 bathroom2) 1)
		(= (movement-time bathroom3 bathroom4) 1)
		(= (movement-time bathroom3 laundryRoom) 1)
		(= (movement-time bathroom3 storage) 1)
		(= (movement-time bathroom3 out) 1)
		(= (movement-time bathroom3 study) 1)
		(= (movement-time bathroom4 robotRoom) 1)
		(= (movement-time bathroom4 floor1) 1)
		(= (movement-time bathroom4 floor2) 1)
		(= (movement-time bathroom4 basement) 1)
		(= (movement-time bathroom4 livingRoom) 1)
		(= (movement-time bathroom4 kitchen) 1)
		(= (movement-time bathroom4 diningRoom) 1)
		(= (movement-time bathroom4 bedroomParents) 1)
		(= (movement-time bathroom4 bedroomGrandparents1) 1)
		(= (movement-time bathroom4 bedroomGrandparents2) 1)
		(= (movement-time bathroom4 kidsRoom1) 1)
		(= (movement-time bathroom4 kidsRoom2) 1)
		(= (movement-time bathroom4 bathroom1) 1)
		(= (movement-time bathroom4 bathroom2) 1)
		(= (movement-time bathroom4 bathroom3) 1)
		(= (movement-time bathroom4 laundryRoom) 1)
		(= (movement-time bathroom4 storage) 1)
		(= (movement-time bathroom4 out) 1)
		(= (movement-time bathroom4 study) 1)
		(= (movement-time laundryRoom robotRoom) 1)
		(= (movement-time laundryRoom floor1) 1)
		(= (movement-time laundryRoom floor2) 1)
		(= (movement-time laundryRoom basement) 1)
		(= (movement-time laundryRoom livingRoom) 1)
		(= (movement-time laundryRoom kitchen) 1)
		(= (movement-time laundryRoom diningRoom) 1)
		(= (movement-time laundryRoom bedroomParents) 1)
		(= (movement-time laundryRoom bedroomGrandparents1) 1)
		(= (movement-time laundryRoom bedroomGrandparents2) 1)
		(= (movement-time laundryRoom kidsRoom1) 1)
		(= (movement-time laundryRoom kidsRoom2) 1)
		(= (movement-time laundryRoom bathroom1) 1)
		(= (movement-time laundryRoom bathroom2) 1)
		(= (movement-time laundryRoom bathroom3) 1)
		(= (movement-time laundryRoom bathroom4) 1)
		(= (movement-time laundryRoom storage) 1)
		(= (movement-time laundryRoom out) 1)
		(= (movement-time laundryRoom study) 1)
		(= (movement-time storage robotRoom) 1)
		(= (movement-time storage floor1) 1)
		(= (movement-time storage floor2) 1)
		(= (movement-time storage basement) 1)
		(= (movement-time storage livingRoom) 1)
		(= (movement-time storage kitchen) 1)
		(= (movement-time storage diningRoom) 1)
		(= (movement-time storage bedroomParents) 1)
		(= (movement-time storage bedroomGrandparents1) 1)
		(= (movement-time storage bedroomGrandparents2) 1)
		(= (movement-time storage kidsRoom1) 1)
		(= (movement-time storage kidsRoom2) 1)
		(= (movement-time storage bathroom1) 1)
		(= (movement-time storage bathroom2) 1)
		(= (movement-time storage bathroom3) 1)
		(= (movement-time storage bathroom4) 1)
		(= (movement-time storage laundryRoom) 1)
		(= (movement-time storage out) 1)
		(= (movement-time storage study) 1)
		(= (movement-time out robotRoom) 1)
		(= (movement-time out floor1) 1)
		(= (movement-time out floor2) 1)
		(= (movement-time out basement) 1)
		(= (movement-time out livingRoom) 1)
		(= (movement-time out kitchen) 1)
		(= (movement-time out diningRoom) 1)
		(= (movement-time out bedroomParents) 1)
		(= (movement-time out bedroomGrandparents1) 1)
		(= (movement-time out bedroomGrandparents2) 1)
		(= (movement-time out kidsRoom1) 1)
		(= (movement-time out kidsRoom2) 1)
		(= (movement-time out bathroom1) 1)
		(= (movement-time out bathroom2) 1)
		(= (movement-time out bathroom3) 1)
		(= (movement-time out bathroom4) 1)
		(= (movement-time out laundryRoom) 1)
		(= (movement-time out storage) 1)
		(= (movement-time out study) 1)
		(= (movement-time study robotRoom) 1)
		(= (movement-time study floor1) 1)
		(= (movement-time study floor2) 1)
		(= (movement-time study basement) 1)
		(= (movement-time study livingRoom) 1)
		(= (movement-time study kitchen) 1)
		(= (movement-time study diningRoom) 1)
		(= (movement-time study bedroomParents) 1)
		(= (movement-time study bedroomGrandparents1) 1)
		(= (movement-time study bedroomGrandparents2) 1)
		(= (movement-time study kidsRoom1) 1)
		(= (movement-time study kidsRoom2) 1)
		(= (movement-time study bathroom1) 1)
		(= (movement-time study bathroom2) 1)
		(= (movement-time study bathroom3) 1)
		(= (movement-time study bathroom4) 1)
		(= (movement-time study laundryRoom) 1)
		(= (movement-time study storage) 1)
		(= (movement-time study out) 1)


		(capability r1 vaccuum)
		(capability r1 recharge-r1)
		(capability r2 sortStuff)
		(capability r2 laundry)
		(capability r2 collectLaundry)
		(capability r2 recharge-r2)
		(capability r3 collectTrash)
		(capability r3 takeOutTrash)
		(capability r3 cleanRoom)
		(capability r3 recharge-r3)
		(capability r4 entertain)
		(capability r4 assist)
		(capability r4 recharge-r4)
	
		(= (execution-time r1 vaccuum) 30)
		(= (execution-time r1 recharge-r1) 120)
		(= (execution-time r2 sortStuff) 60)
		(= (execution-time r2 laundry) 60)
		(= (execution-time r2 collectLaundry) 10)
		(= (execution-time r2 recharge-r2) 240)
		(= (execution-time r3 collectTrash) 60)
		(= (execution-time r3 takeOutTrash) 5)
		(= (execution-time r3 cleanRoom) 40)
		(= (execution-time r3 recharge-r3) 60)
		(= (execution-time r4 entertain) 60)
		(= (execution-time r4 assist) 20)
		(= (execution-time r4 recharge-r4) 120)
	
		(married mother father)
		(married grandmother1 grandfather1)
		(married grandmother2 grandfather2)
		
		(location-type bedroomParents bedroom)
		(location-type bedroomGrandparents1 bedroom)
		(location-type bedroomGrandparents2 bedroom)
	
		(location-type bathroom1 bathroom)
		(location-type bathroom2 bathroom)
		(location-type bathroom3 bathroom)
		(location-type bathroom4 bathroom)

		(location-type kidsRoom1 kidsRoom)
		(location-type kidsRoom2 kidsRoom)
	
		(has-role mother parent)
		(has-role father parent)
		(has-role kid1 kid)
		(has-role kid2 kid)
		(has-role kid3 kid)
		(has-role kid4 kid)
		(has-role infant1 infant)
		(has-role infant2 infant)
		(has-role grandmother1 grandparent)
		(has-role grandmother2 grandparent)
		(has-role grandfather1 grandparent)
		(has-role grandfather2 grandparent)
	
		(has-property mother lightSleeper)
		(has-property father heavySleeper)
		(has-property grandfather1 heavySleeper)
		(has-property grandmother1 lightSleeper)
		
		(has-property grandfather1 hatesRobots)
		
		(has-property mother lightSleeper)
		(has-property father lightSleeper)
		(has-property kid1 normalSleeper)
		(has-property kid2 normalSleeper)
		(has-property kid3 normalSleeper)
		(has-property kid4 normalSleeper)
		(has-property infant1 lightSleeper)
		(has-property infant2 lightSleeper)
		(has-property grandmother1 normalSleeper)
		(has-property grandmother2 heavySleeper)
		(has-property grandfather1 normalSleeper)
		(has-property grandfather2 heavySleeper)

		(has-property kid1 easilyDistracted)
		(has-property kid2 easilyDistracted)
		(has-property kid3 easilyDistracted)
		(has-property kid4 easilyDistracted)

	)
	(:goal (and
		(state tCollectlaundry1 collectLaundry bathroom3 finished)
		(state tSortstuff2 sortStuff bedroomParents finished)
		(state tAssist3 assist storage finished)
		(state tCollecttrash4 collectTrash kitchen finished)
		(state tTakeouttrash5 takeOutTrash out finished)
		(state tEntertain6 entertain livingRoom finished)
		(state tVaccuum7 vaccuum kitchen finished)
		(state tCollectlaundry8 collectLaundry bathroom3 finished)
		(state tEntertain9 entertain kidsRoom1 finished)
		(state tTakeouttrash10 takeOutTrash out finished)
	))
	;; Preferences
	(:constraints
		;; IC ( LightSleeper ?H ?L ?T ?C ?I1 ?I2 )
		(and
			(forall (?H - human)
				(forall (?L - location)
					(forall (?T - robot-task)
						(preference LightSleeper-1
							(always
								(not 
									(and 
										(human-activity ?H ?L sleeping)
										(state ?T vaccuum ?L processing)
										(has-property ?H normalSleeper)
									)
								)	
							)
						)
					)
				)
			)
			(forall (?H - human)
				(forall (?L - location)
					(forall (?T - robot-task)
						(preference LightSleeper-2
							(always
								(not 
									(and 
										(human-activity ?H ?L sleeping)
										(state ?T cleanRoom ?L processing)
										(has-property ?H normalSleeper)
									)
								)	
							)
						)
					)
				)
			)
			(forall (?H - human)
				(forall (?L - location)
					(forall (?T - robot-task)
						(preference LightSleeper-3
							(always
								(not 
									(and 
										(human-activity ?H ?L sleeping)
										(state ?T sortStuff ?L processing)
										(has-property ?H normalSleeper)
									)
								)	
							)
						)
					)
				)
			)
			;; IC ( LetMeRead ?H ?L ?T ?I1 ?I2 )
			;(forall (?H - human)
			;	(forall (?L - location)
			;		(forall (?T - robot-task)
			;			(preference LetMeRead-1
			;				(always
			;					(not 
			;						(and 
			;							(human-activity ?H ?L reading)
			;							(state ?T vaccuum ?L processing)
			;						)
			;					)	
			;				)
			;			)
			;		)
			;	)
			;)
			;; IC ( LetMeRead ?H ?L ?T ?I1 ?I2 )
			(forall (?H - human)
				(forall (?L - location)
					(forall (?T - robot-task)
						(preference LetMeRead-1
							(always
								(or 
									(and 
										(not (human-activity ?H ?L reading))
										(state ?T vaccuum ?L processing)
									)
									(and 
										(human-activity ?H ?L reading)
										(not (state ?T vaccuum ?L processing))
									)
									(and 
										(not (human-activity ?H ?L reading))
										(not (state ?T vaccuum ?L processing))
									)
								)	
							)
						)
					)
				)
			)
		)
	)
	(:metric minimize (+ 
		(* 100000000 (is-violated LightSleeper-1))
		(* 100000000 (is-violated LightSleeper-2))
		(* 100000000 (is-violated LightSleeper-3))
		(* 10 (is-violated LetMeRead-1))
	))

)